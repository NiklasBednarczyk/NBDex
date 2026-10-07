# NB Dex

## Targets

|    Target    | Configuration Type |                                                  Notes                                                  |
|:------------:|:------------------:|:-------------------------------------------------------------------------------------------------------:|
|   Android    |    Android App     |                                     Module: `NBDex.app.androidApp`                                      |
|   Desktop    |       Gradle       | Run: `hotRun --mainClass "de.niklasbednarczyk.nbdex.MainKt"`<br/>Gradle project: `NBDex:app:desktopApp` |
|     iOS      | XCode Application  |                                            Target: `iOSApp`                                             |
|   Web (js)   |       Gradle       |                  Run: `jsBrowserDevelopmentRun`<br/>Gradle project: `NBDex:app:webApp`                  |
| Web (wasmJs) |       Gradle       |                Run: `wasmJsBrowserDevelopmentRun`<br/>Gradle project: `NBDex:app:webApp`                |

## Modularization

|     Layer     |                 Description                 |                                 Depends on                                 |                                                               Important dependencies                                                                |
|:-------------:|:-------------------------------------------:|:--------------------------------------------------------------------------:|:---------------------------------------------------------------------------------------------------------------------------------------------------:|
|     `app`     | Combines all modules and handles navigation | `core`<br/>`data`<br/>`disk`<br/>`feature`<br/>`network`<br/>`persistence` |             [Navigation3](https://developer.android.com/guide/navigation/navigation-3)<br/>[Koin](https://github.com/InsertKoinIO/koin)             |
|    `core`     |   Implementation used by multiple modules   |                                     -                                      |                                                                          -                                                                          |
|    `data`     |          Data fetching and storing          |       `core`<br/>`disk`<br/>`model`<br/>`network`<br/>`persistence`        |                                             [Coroutines](https://github.com/Kotlin/kotlinx.coroutines)                                              |
|    `disk`     |       Managing local preference data        |                             `core`<br/>`model`                             |              [DataStore](https://developer.android.com/jetpack/androidx/releases/datastore)<br/>[Wire](https://github.com/square/wire)              |
|   `feature`   |           Feature within the app            |                       `core`<br/>`data`<br/>`model`                        |               [Coil](https://github.com/coil-kt/coil)<br/>[Compose Multiplatform](https://github.com/JetBrains/compose-multiplatform)               |
|    `model`    |       Models used by multiple layers        |                                   `core`                                   |                                                                          -                                                                          |
|   `network`   |            Managing network data            |                             `core`<br/>`model`                             |                                              [Apollo](https://github.com/apollographql/apollo-kotlin)                                               |
| `persistence` |        Managing local database data         |                             `core`<br/>`model`                             | [Room3](https://developer.android.com/jetpack/androidx/releases/room3)<br/>[Sqlite](https://developer.android.com/jetpack/androidx/releases/sqlite) |

## Scripts

### SvgToImageVector

Used to turn SVGs into Image Vectors with [Valkyrie](https://github.com/ComposeGears/Valkyrie)

#### How to use

- Add SVGs into `scripts/svgToImageVector/svg/<iconPack>`
- Run `bash scripts/svgToImageVector/convert.sh`

#### Icon packs

|                             Name                             |                                Notes                                |
|:------------------------------------------------------------:|:-------------------------------------------------------------------:|
|          [Material](https://fonts.google.com/icons)          | Style: Outlined<br/>Weight: 400<br/>Grade: 0<br/>Optical Size: 24px |
| [Type](https://github.com/duiker101/pokemon-type-svg-icons/) |                                  -                                  |

## Credits

|                               Name                                |                   Usage                    |
|:-----------------------------------------------------------------:|:------------------------------------------:|
|                  [PokéAPI](https://pokeapi.co/)                   |         Data and images of Pokémon         |
| [duiker101](https://github.com/duiker101/pokemon-type-svg-icons/) |          Icons for Pokémon types           |
|         [Bulbapedia](https://bulbapedia.bulbagarden.net/)         | Color codes for Pokémon types and versions |

## Disclaimer

NB Dex is an unofficial, free fan made app and is NOT affiliated, endorsed or supported by Nintendo, GAME FREAK or The Pokémon company in any way.<br/>Some images used in this app are copyrighted and are supported under fair use.<br/>Pokémon and Pokémon character names are trademarks of Nintendo.<br/>No copyright infringement intended.<br/><br/>Pokémon © 2002-2026 Pokémon.<br/>© 1995-2026 Nintendo/Creatures Inc./GAME FREAK Inc.
