package de.niklasbednarczyk.nbdex.core.model.endpoint

import de.niklasbednarczyk.nbdex.core.model.id.CoreLanguageId
import de.niklasbednarczyk.nbdex.core.model.id.CoreRegionId
import de.niklasbednarczyk.nbdex.core.model.id.CoreRegionNameId

data class CoreRegionName(
    val id: CoreRegionNameId,
    val languageId: CoreLanguageId?,
    val name: String,
    val regionId: CoreRegionId?,
) {

    companion object {

        fun example(
            id: CoreRegionNameId = CoreRegionNameId.example(),
            languageId: CoreLanguageId? = CoreLanguageId.example(),
            name: String = "RegionName Name",
            regionId: CoreRegionId? = CoreRegionId.example(),
        ): CoreRegionName {
            return CoreRegionName(
                id = id,
                languageId = languageId,
                name = name,
                regionId = regionId,
            )
        }

    }

}