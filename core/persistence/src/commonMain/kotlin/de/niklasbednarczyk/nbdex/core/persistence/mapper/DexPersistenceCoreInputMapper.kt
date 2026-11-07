package de.niklasbednarczyk.nbdex.core.persistence.mapper

interface DexPersistenceCoreInputMapper<Model : Any, Persistence : Any, Input : Any> :
    DexPersistenceCoreMapper<Model, Persistence> {
    fun persistenceToInput(
        persistence: Persistence,
    ): Input?

    fun persistenceListToModel(
        persistenceList: List<Persistence>,
        input: Input,
    ): Model {
        val persistence = persistenceList.first { persistence ->
            persistenceToInput(persistence) == input
        }
        return persistenceToModel(persistence)
    }

    fun persistenceListToModelNullable(
        persistenceList: List<Persistence>,
        input: Input,
    ): Model? {
        val persistence = persistenceList.firstOrNull { persistence ->
            persistenceToInput(persistence) == input
        }
        return persistenceToModelNullable(persistence)
    }
}
