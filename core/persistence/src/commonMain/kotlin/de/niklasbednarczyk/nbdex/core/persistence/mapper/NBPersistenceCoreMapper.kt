package de.niklasbednarczyk.nbdex.core.persistence.mapper

interface NBPersistenceCoreMapper<Model : Any, Persistence : Any> {
    fun modelToPersistence(
        model: Model,
    ): Persistence

    fun modelListToPersistenceList(
        modelList: List<Model>,
    ): List<Persistence> {
        return modelList.map(::modelToPersistence)
    }

    fun persistenceToModel(
        persistence: Persistence,
    ): Model

    fun persistenceToModelNullable(
        persistence: Persistence?,
    ): Model? {
        return persistence?.let(::persistenceToModel)
    }
}
