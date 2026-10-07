package de.niklasbednarczyk.nbdex.core.model.endpoint.display.type

import de.niklasbednarczyk.nbdex.core.model.id.NBId

interface NBDisplayType<Id : NBId> {
    val id: Id
}
