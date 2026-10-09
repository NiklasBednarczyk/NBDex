package de.niklasbednarczyk.nbdex.core.model.endpoint.display.model

import de.niklasbednarczyk.nbdex.core.model.endpoint.display.type.NBDisplayType
import de.niklasbednarczyk.nbdex.core.model.id.NBId

interface NBDisplayModel<Id : NBId, DisplayType : NBDisplayType<Id>> {
    val id: Id?

    val displayType: DisplayType?
}
