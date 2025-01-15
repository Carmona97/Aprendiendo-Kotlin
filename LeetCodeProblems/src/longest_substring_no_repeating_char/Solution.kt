package longest_substring_no_repeating_char
/*Given a string s, find the length of the longest
substring
 without repeating characters.



Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.


Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.*/
fun main() {
    println(lengthOfLongestSubstring(" "))
}

fun lengthOfLongestSubstring(s: String): Int {
    var left:Int = 0
    var right:Int = 0
    var subString = StringBuilder()
    var longestLength:Int = 0

    while (right < s.length){
        if (!subString.contains(s[right])){
            subString.append(s[right])
            right++
            longestLength = maxOf(longestLength,subString.length)
        }else{
            left++
            right = left
            subString.clear()
        }
    }


    return longestLength

}