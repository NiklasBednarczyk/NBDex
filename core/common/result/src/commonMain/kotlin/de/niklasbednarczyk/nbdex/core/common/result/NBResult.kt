package de.niklasbednarczyk.nbdex.core.common.result

sealed interface NBResult<out T> {
    data class Success<T>(
        val data: T,
    ) : NBResult<T>

    data object Error : NBResult<Nothing>

    data object Loading : NBResult<Nothing>
}
