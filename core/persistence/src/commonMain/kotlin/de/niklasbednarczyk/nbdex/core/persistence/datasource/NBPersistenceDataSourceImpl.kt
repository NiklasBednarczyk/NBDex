package de.niklasbednarczyk.nbdex.core.persistence.datasource

import de.niklasbednarczyk.nbdex.core.persistence.mapper.NBPersistenceCoreMapper

abstract class NBPersistenceDataSourceImpl {

    protected suspend fun <Model : Any, Persistence : Any> insertList(
        modelList: List<Model>,
        mapper: NBPersistenceCoreMapper<Model, Persistence>,
        insert: suspend (List<Persistence>) -> Unit,
    ) {
        val persistenceList = mapper.modelListToPersistenceList(
            modelList = modelList,
        )
        insert(persistenceList)
    }

}