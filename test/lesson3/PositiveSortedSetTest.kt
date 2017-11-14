package lesson3

import org.junit.Assert.*
import org.junit.Test

class PositiveSortedSetTest {
    @Test
    fun basic() {
        val set = sortedSetOf(7, -4, 5, 9, -3, 4, 0, 99, -12)
        val subSet = set.positives()
        assertEquals(6, subSet.size)
        subSet.add(10)
        assertEquals(7, subSet.size)
        assertEquals(10, set.size)
        subSet.add(-10)
        assertEquals(7, subSet.size)
        assertEquals(10, set.size)
        set.remove(5)
        assertEquals(6, subSet.size)
        assertEquals(9, set.size)
        set.remove(-4)
        assertEquals(6, subSet.size)
        assertEquals(8, set.size)
        subSet.remove(99)
        assertEquals(5, subSet.size)
        assertEquals(7, set.size)
    }
}