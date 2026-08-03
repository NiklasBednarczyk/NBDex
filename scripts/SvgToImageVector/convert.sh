#!/bin/bash

VALKYRIE_CLI_VERSION="cli-1.0.0"
VALKYRIE_CLI_LATEST_RELEASE_URL=$(curl --silent "https://api.github.com/repos/ComposeGears/Valkyrie/releases/tags/$VALKYRIE_CLI_VERSION" \
  | jq -r '.assets[] | select(.name | startswith("valkyrie-cli")) | .browser_download_url')
VALKYRIE_CLI_TMP_DIRECTORY="valkyrie_cli"
VALKYRIE_CLI_TMP_ZIP="valkyrie_cli.zip"

SVG_DIRECTORY="scripts/svgToImageVector/svg"

IMAGE_VECTOR_COLOR_DEFAULT="Color(0xFFBA1A1A)"
IMAGE_VECTOR_ICON_PACK="NBIcons"
IMAGE_VECTOR_IMPORT_LAST="androidx.compose.ui.unit.dp"
IMAGE_VECTOR_OUTPUT_PATH="core/ui/resource/src/commonMain/kotlin/de/niklasbednarczyk/nbdex/core/ui/resource/icon"
IMAGE_VECTOR_PACKAGE_NAME="de.niklasbednarczyk.nbdex.core.ui.resource.icon"

function get_directory_name() {
  input=$1
  dir=${input%*/}         # remove the trailing "/"
  echo "${dir##*/}"       # print everything after the final "/"
}

function get_image_vector_nested_pack_name() {
  input=$1
  capitalized="$(tr '[:lower:]' '[:upper:]' <<<"${input:0:1}")${input:1}"
  echo "$IMAGE_VECTOR_ICON_PACK.$capitalized"
}

function join_by_char() {
  local IFS="$1"
  shift
  echo "$*"
}

# Download latest Valkyrie CLI
curl -L -o "$VALKYRIE_CLI_TMP_ZIP" "$VALKYRIE_CLI_LATEST_RELEASE_URL"
mkdir -p "$VALKYRIE_CLI_TMP_DIRECTORY"
unzip -o "$VALKYRIE_CLI_TMP_ZIP" -d "$VALKYRIE_CLI_TMP_DIRECTORY"

# Remove output folder content
rm -rf "$IMAGE_VECTOR_OUTPUT_PATH"

# Create icon pack
nested_pack_names=()
for dir in "$SVG_DIRECTORY"/*/
do
  directory_name=$(get_directory_name $"$dir")
  nested_pack_name=$(get_image_vector_nested_pack_name "$directory_name")
  nested_pack_names+=("$nested_pack_name")
done
iconpack=$(join_by_char , "${nested_pack_names[@]}")
"$VALKYRIE_CLI_TMP_DIRECTORY"/bin/valkyrie iconpack --iconpack="$iconpack" --output-path="$IMAGE_VECTOR_OUTPUT_PATH" --package-name="$IMAGE_VECTOR_PACKAGE_NAME"

# Convert svg or xml to image vector
for dir in "$SVG_DIRECTORY"/*/
do
  directory_name=$(get_directory_name "$dir")
  output_path="$IMAGE_VECTOR_OUTPUT_PATH/$directory_name"
  package_name="$IMAGE_VECTOR_PACKAGE_NAME.$directory_name"
  iconpack_name=$(get_image_vector_nested_pack_name "$directory_name")
  "$VALKYRIE_CLI_TMP_DIRECTORY"/bin/valkyrie svgxml2imagevector --input-path="$dir" --output-path="$output_path" --package-name="$package_name" --iconpack-name="$iconpack_name" --generate-preview=true --preview-annotation-type=AndroidX
done

# Fix image vector files
for file in "$IMAGE_VECTOR_OUTPUT_PATH"/**/*
do
  sed -i "/import $IMAGE_VECTOR_IMPORT_LAST/a import $IMAGE_VECTOR_PACKAGE_NAME.$IMAGE_VECTOR_ICON_PACK" "$file"  # Add imports for icon pack
  sed -i "s/path(fill = SolidColor(.*)/path(fill = SolidColor($IMAGE_VECTOR_COLOR_DEFAULT))/g" "$file"            # Replace svg color with default color for image vectors where fill is in same line as path
  sed -i "s/ fill = SolidColor(.*)/ fill = SolidColor($IMAGE_VECTOR_COLOR_DEFAULT)/g" "$file"                     # Replace svg color with default color for image vectors where fill is not in same line as path
done

# Remove tmp data
rm -rf "$VALKYRIE_CLI_TMP_DIRECTORY"
rm "$VALKYRIE_CLI_TMP_ZIP"
