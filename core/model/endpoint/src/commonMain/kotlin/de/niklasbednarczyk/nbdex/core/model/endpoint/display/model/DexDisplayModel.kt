package de.niklasbednarczyk.nbdex.core.model.endpoint.display.model

import de.niklasbednarczyk.nbdex.core.model.endpoint.display.type.DexDisplayType
import de.niklasbednarczyk.nbdex.core.model.id.DexId

interface DexDisplayModel<Id : DexId, DisplayType : DexDisplayType<Id>> {
    val id: Id?

    val displayType: DisplayType?
}
