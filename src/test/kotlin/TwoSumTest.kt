import model.InOutModel
import org.junit.jupiter.api.Assertions
import kotlin.test.Test
import kotlin.test.assertContentEquals

internal class TwoSumTest {

    private val testCase1: InOutModel<TwoSumModel, IntArray> =
        InOutModel(TwoSumModel(nums = intArrayOf(2,7,11,15), target = 9), intArrayOf(0,1))

    private val testCase2: InOutModel<TwoSumModel, IntArray> =
        InOutModel(TwoSumModel(nums = intArrayOf(3,2,4), target = 6), intArrayOf(1,2))

    private val testCase3: InOutModel<TwoSumModel, IntArray> =
        InOutModel(TwoSumModel(nums = intArrayOf(3,3), target = 6), intArrayOf(0,1))

    private val testCase4: InOutModel<TwoSumModel, IntArray> =
        InOutModel(TwoSumModel(nums = intArrayOf(3,-1,-2,-3), target = 0), intArrayOf(0,3))

    private val testCase5: InOutModel<TwoSumModel, IntArray> =
        InOutModel(TwoSumModel(nums = intArrayOf(111,-111,-321,99,666,-888), target = -1209), intArrayOf(2,5))

    @Test
    fun twoSum_testCase1() =
        Assertions.assertTrue(testCase1.output contentEquals TwoSum.twoSum(testCase1.input.nums, testCase1.input.target))

    @Test
    fun twoSum_testCase2() =
        assertContentEquals(testCase2.output, TwoSum.twoSum(testCase2.input.nums, testCase2.input.target))

    @Test
    fun twoSum_testCase3() =
        assertContentEquals(testCase3.output, TwoSum.twoSum(testCase3.input.nums, testCase3.input.target))

    @Test
    fun twoSum_testCase4() =
        assertContentEquals(testCase4.output, TwoSum.twoSum(testCase4.input.nums, testCase4.input.target))

    @Test
    fun twoSum_testCase5() =
        assertContentEquals(testCase5.output, TwoSum.twoSum(testCase5.input.nums, testCase5.input.target))


    @Test
    fun twoSum_1_testCase1() =
        Assertions.assertTrue(testCase1.output contentEquals TwoSum.twoSum_1(testCase1.input.nums, testCase1.input.target))

    @Test
    fun twoSum_1_testCase2() =
        assertContentEquals(testCase2.output, TwoSum.twoSum_1(testCase2.input.nums, testCase2.input.target))

    @Test
    fun twoSum_1_testCase3() =
        assertContentEquals(testCase3.output, TwoSum.twoSum_1(testCase3.input.nums, testCase3.input.target))

    @Test
    fun twoSum_1_testCase4() =
        assertContentEquals(testCase4.output, TwoSum.twoSum_1(testCase4.input.nums, testCase4.input.target))

    @Test
    fun twoSum_1_testCase5() =
        assertContentEquals(testCase5.output, TwoSum.twoSum_1(testCase5.input.nums, testCase5.input.target))


    @Test
    fun twoSum_2_testCase1() =
        Assertions.assertTrue(testCase1.output contentEquals TwoSum.twoSum_2(testCase1.input.nums, testCase1.input.target))

    @Test
    fun twoSum_2_testCase2() =
        assertContentEquals(testCase2.output, TwoSum.twoSum_2(testCase2.input.nums, testCase2.input.target))

    @Test
    fun twoSum_2_testCase3() =
        assertContentEquals(testCase3.output, TwoSum.twoSum_2(testCase3.input.nums, testCase3.input.target))

    @Test
    fun twoSum_2_testCase4() =
        assertContentEquals(testCase4.output, TwoSum.twoSum_2(testCase4.input.nums, testCase4.input.target))

    @Test
    fun twoSum_2_testCase5() =
        assertContentEquals(testCase5.output, TwoSum.twoSum_2(testCase5.input.nums, testCase5.input.target))


    internal data class TwoSumModel(
        val nums: IntArray,
        val target: Int
    ) {
        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (javaClass != other?.javaClass) return false

            other as TwoSumModel

            if (!nums.contentEquals(other.nums)) return false
            if (target != other.target) return false

            return true
        }

        override fun hashCode(): Int {
            var result = nums.contentHashCode()
            result = 31 * result + target
            return result
        }
    }
}