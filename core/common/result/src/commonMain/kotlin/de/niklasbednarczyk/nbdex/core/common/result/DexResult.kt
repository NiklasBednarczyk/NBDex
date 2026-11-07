package de.niklasbednarczyk.nbdex.core.common.result

sealed interface DexResult<out T> {
    data class Success<T>(
        val data: T,
    ) : DexResult<T>

    data object Error : DexResult<Nothing>

    data object Loading : DexResult<Nothing>
}
