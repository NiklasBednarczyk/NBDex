package de.niklasbednarczyk.nbdex.core.model.endpoint.display.type

import de.niklasbednarczyk.nbdex.core.model.id.DexId

interface DexDisplayType<Id : DexId> {
    val id: Id
}
