package longest_common_prefix
/*Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.


Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters.*/

fun main() {

    val strs = arrayOf("")
    println(longestCommonPrefix(strs))
}

fun longestCommonPrefix(strs: Array<String>): String {
    if (strs.isEmpty()) return ""

    var resultPrefix = StringBuilder()
    var prefixLetterIndex = 0

    while (true) {

        if (strs.any { it.length <= prefixLetterIndex }) break

        val currentChar = strs[0][prefixLetterIndex]

        if (strs.all { it[prefixLetterIndex] == currentChar }) {
            resultPrefix.append(currentChar)
            prefixLetterIndex++
        } else {
            break
        }
    }

    return resultPrefix.toString()
}
