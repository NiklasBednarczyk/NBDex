package de.niklasbednarczyk.nbdex.core.model.id

interface NBId : Comparable<NBId> {
    val value: Int

    override fun compareTo(
        other: NBId,
    ): Int {
        return compareValuesBy(this, other) { id -> id.value }
    }

    companion object {
        internal const val EXAMPLE_VALUE = -1

        fun <Id : NBId> fromNullable(
            value: Int?,
            block: (Int) -> Id?,
        ): Id? {
            return value?.let(block)
        }
    }
}
