package de.niklasbednarczyk.nbdex.core.model.endpoint.display.model.versiongroup

import de.niklasbednarczyk.nbdex.core.model.endpoint.CoreVersionGroup
import de.niklasbednarczyk.nbdex.core.model.endpoint.display.model.NBDisplayModel
import de.niklasbednarczyk.nbdex.core.model.endpoint.display.type.CoreDisplayTypeVersionGroup
import de.niklasbednarczyk.nbdex.core.model.id.CoreVersionGroupId

interface CoreDisplayModelVersionGroup :
    NBDisplayModel<CoreVersionGroupId, CoreDisplayTypeVersionGroup> {
    val versionGroup: CoreVersionGroup

    val versions: List<CoreDisplayModelVersionGroupVersion>

    override val id: CoreVersionGroupId?
        get() = versionGroup.id

    override val displayType: CoreDisplayTypeVersionGroup?
        get() = CoreDisplayTypeVersionGroup.from(id)

    companion object {
        fun example(
            versionGroup: CoreVersionGroup = CoreVersionGroup.example(),
            versions: List<CoreDisplayModelVersionGroupVersion> = listOf(CoreDisplayModelVersionGroupVersion.example()),
        ): CoreDisplayModelVersionGroup {
            return object : CoreDisplayModelVersionGroup {
                override val versionGroup: CoreVersionGroup
                    get() = versionGroup
                override val versions: List<CoreDisplayModelVersionGroupVersion>
                    get() = versions
            }
        }
    }
}
