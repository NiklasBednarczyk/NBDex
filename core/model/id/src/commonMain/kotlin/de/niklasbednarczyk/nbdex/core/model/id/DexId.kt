package de.niklasbednarczyk.nbdex.core.model.id

interface DexId : Comparable<DexId> {
    val value: Int

    override fun compareTo(
        other: DexId,
    ): Int {
        return compareValuesBy(this, other) { id -> id.value }
    }

    companion object {
        internal const val EXAMPLE_VALUE = -1

        fun <Id : DexId> fromNullable(
            value: Int?,
            block: (Int) -> Id?,
        ): Id? {
            return value?.let(block)
        }
    }
}
