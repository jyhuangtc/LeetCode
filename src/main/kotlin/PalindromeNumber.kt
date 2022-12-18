/**
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 *
 * Palindrome: An integer is a palindrome when it reads the same forward and backward.
 *
 * For example, 121 is a palindrome while 123 is not.
 *
 *
 *
 * Example 1:
 *
 * Input: x = 121
 *
 * Output: true
 *
 * Explanation: 121 reads as 121 from left to right and from right to left.
 *
 *
 *
 * Example 2:
 *
 * Input: x = -121
 *
 * Output: false
 *
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore, it is not a palindrome.
 *
 *
 *
 * Example 3:
 *
 * Input: x = 10
 *
 * Output: false
 *
 * Explanation: Reads 01 from right to left. Therefore, it is not a palindrome.
 *
 *
 *
 * Constraints:
 *
 * -2^31 <= x <= 2^31 - 1
 *
 *
 * Follow up: Could you solve it without converting the integer to a string?
 */

object PalindromeNumber {

    fun isPalindrome(x: Int): Boolean {
        if (x < 0) return false
        val str = x.toString().toCharArray()
        var first = 0
        var last = str.size-1

        while (first <= last) {
            if (str[first] != str[last]) return false
            first++
            last--
        }

        return true
    }

    fun isPalindrome_1(x: Int): Boolean {
        if (x < 0) return false
        if (x == 0) return true
        val map = mutableMapOf<Int, Int>()
        var temp = x
        while (temp > 0) {
            val index = temp % 10
            map[index] = (map[index] ?: 0) + 1
            temp /= 10
        }
        var evenCount = 0
        map.forEach {
            if (it.value % 2 != 0) evenCount++
        }
        return evenCount <= 1
    }

    fun isPalindrome_2(x: Int): Boolean {
        // Special cases:
        // As discussed above, when x < 0, x is not a palindrome.
        // Also, if the last digit of the number is 0, in order to be a palindrome,
        // the first digit of the number also needs to be 0.
        // Only 0 satisfy this property.
        if (x < 0 || x % 10 == 0 && x != 0) {
            return false
        }

        var tempX = x
        var revertedNumber = 0
        while (tempX > revertedNumber) {
            revertedNumber = revertedNumber * 10 + tempX % 10
            tempX /= 10
        }

        // When the length is an odd number, we can get rid of the middle digit by revertedNumber/10
        // For example when the input is 12321, at the end of the while loop we get x = 12, revertedNumber = 123,
        // since the middle digit doesn't matter in palindrome(it will always equal to itself), we can simply get rid of it.
        return tempX == revertedNumber || tempX == revertedNumber / 10
    }
}