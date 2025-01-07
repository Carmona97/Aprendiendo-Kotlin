package plus_one
import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class PlusOneTest {

    @Test
    fun testPlusOne_basicCase() {
        val input = intArrayOf(1, 2, 3)
        val expected = intArrayOf(1, 2, 4)
        val result = plusOne(input)
        assertArrayEquals(expected, result)
    }

    @Test
    fun testPlusOne_carryOver() {
        val input = intArrayOf(9, 9, 9)
        val expected = intArrayOf(1, 0, 0, 0)
        val result = plusOne(input)
        assertArrayEquals(expected, result)
    }

    @Test
    fun testPlusOne_singleDigit() {
        val input = intArrayOf(0)
        val expected = intArrayOf(1)
        val result = plusOne(input)
        assertArrayEquals(expected, result)
    }

    @Test
    fun testPlusOne_largeArray() {
        val input = intArrayOf(9, 8, 7, 6, 5, 4, 3, 2, 1, 0)
        val expected = intArrayOf(9, 8, 7, 6, 5, 4, 3, 2, 1, 1)
        val result = plusOne(input)
        assertArrayEquals(expected, result)
    }

    @Test
    fun testPlusOne_emptyArray() {
        val input = intArrayOf()
        val expected = intArrayOf(1)
        val result = plusOne(input)
        assertArrayEquals(expected, result)
    }
}