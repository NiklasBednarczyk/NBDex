package de.niklasbednarczyk.nbdex.core.persistence.mapper

interface NBPersistenceFeatureMapper<Model : Any, Persistence : Any, Input : Any> {
    fun persistenceToModel(
        persistence: Persistence,
        input: Input,
    ): Model

    fun persistenceToModelNullable(
        persistence: Persistence?,
        input: Input,
    ): Model? {
        return persistence?.let {
            persistenceToModel(
                persistence = persistence,
                input = input,
            )
        }
    }

    fun persistenceListToModelList(
        persistenceList: List<Persistence>,
        input: Input,
    ): List<Model> {
        return persistenceList.map { persistence ->
            persistenceToModel(
                persistence = persistence,
                input = input,
            )
        }
    }
}
