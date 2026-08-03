package de.niklasbednarczyk.nbdex.core.model.endpoint.display.model.versiongroup

import de.niklasbednarczyk.nbdex.core.model.endpoint.CoreVersionName
import de.niklasbednarczyk.nbdex.core.model.endpoint.display.model.NBDisplayModel
import de.niklasbednarczyk.nbdex.core.model.endpoint.display.type.CoreDisplayTypeVersion
import de.niklasbednarczyk.nbdex.core.model.id.CoreVersionId

interface CoreDisplayModelVersionGroupVersion :
    NBDisplayModel<CoreVersionId, CoreDisplayTypeVersion> {

    override val id: CoreVersionId?
        get() = versionName.versionId

    override val displayType: CoreDisplayTypeVersion?
        get() = CoreDisplayTypeVersion.from(id)

    val versionName: CoreVersionName

    companion object {

        fun example(
            versionName: CoreVersionName = CoreVersionName.example(),
        ): CoreDisplayModelVersionGroupVersion {
            return object : CoreDisplayModelVersionGroupVersion {
                override val versionName: CoreVersionName
                    get() = versionName
            }
        }

    }

}