import model.InOutModel
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class PalindromeNumberTest {

    private val testCase1: InOutModel<Int, Boolean> = InOutModel(121, true)
    private val testCase2: InOutModel<Int, Boolean> = InOutModel(-121, false)
    private val testCase3: InOutModel<Int, Boolean> = InOutModel(10, false)
    private val testCase4: InOutModel<Int, Boolean> = InOutModel(1221, true)
    private val testCase5: InOutModel<Int, Boolean> = InOutModel(12321, true)
    private val testCase6: InOutModel<Int, Boolean> = InOutModel(0, true)
    private val testCase7: InOutModel<Int, Boolean> = InOutModel(1, true)

    @Test
    fun isPalindrome_testCase1() = assertTrue(PalindromeNumber.isPalindrome(testCase1.input))

    @Test
    fun isPalindrome_testCase2() = assertFalse(PalindromeNumber.isPalindrome(testCase2.input))

    @Test
    fun isPalindrome_testCase3() = assertFalse(PalindromeNumber.isPalindrome(testCase3.input))

    @Test
    fun isPalindrome_testCase4() = assertTrue(PalindromeNumber.isPalindrome(testCase4.input))

    @Test
    fun isPalindrome_testCase5() = assertTrue(PalindromeNumber.isPalindrome(testCase5.input))

    @Test
    fun isPalindrome_testCase6() = assertTrue(PalindromeNumber.isPalindrome(testCase6.input))

    @Test
    fun isPalindrome_testCase7() = assertTrue(PalindromeNumber.isPalindrome(testCase7.input))


    @Test
    fun isPalindrome_1_testCase1() = assertTrue(PalindromeNumber.isPalindrome_1(testCase1.input))

    @Test
    fun isPalindrome_1_testCase2() = assertFalse(PalindromeNumber.isPalindrome_1(testCase2.input))

    @Test
    fun isPalindrome_1_testCase3() = assertFalse(PalindromeNumber.isPalindrome_1(testCase3.input))

    @Test
    fun isPalindrome_1_testCase4() = assertTrue(PalindromeNumber.isPalindrome_1(testCase4.input))

    @Test
    fun isPalindrome_1_testCase5() = assertTrue(PalindromeNumber.isPalindrome_1(testCase5.input))

    @Test
    fun isPalindrome_1_testCase6() = assertTrue(PalindromeNumber.isPalindrome_1(testCase6.input))

    @Test
    fun isPalindrome_1_testCase7() = assertTrue(PalindromeNumber.isPalindrome_1(testCase7.input))


    @Test
    fun isPalindrome_2_testCase1() = assertTrue(PalindromeNumber.isPalindrome_2(testCase1.input))

    @Test
    fun isPalindrome_2_testCase2() = assertFalse(PalindromeNumber.isPalindrome_2(testCase2.input))

    @Test
    fun isPalindrome_2_testCase3() = assertFalse(PalindromeNumber.isPalindrome_2(testCase3.input))

    @Test
    fun isPalindrome_2_testCase4() = assertTrue(PalindromeNumber.isPalindrome_2(testCase4.input))

    @Test
    fun isPalindrome_2_testCase5() = assertTrue(PalindromeNumber.isPalindrome_2(testCase5.input))

    @Test
    fun isPalindrome_2_testCase6() = assertTrue(PalindromeNumber.isPalindrome_2(testCase6.input))

    @Test
    fun isPalindrome_2_testCase7() = assertTrue(PalindromeNumber.isPalindrome_2(testCase7.input))
}