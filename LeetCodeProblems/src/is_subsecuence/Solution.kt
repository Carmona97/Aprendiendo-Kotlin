package is_subsecuence

/*Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters.
(i.e., "ace" is a subsequence of "abcde" while "aec" is not).



Example 1:

Input: s = "abc", t = "ahbgdc"
Output: true
Example 2:

Input: s = "axc", t = "ahbgdc"
Output: false


Constraints:

0 <= s.length <= 100
0 <= t.length <= 104
s and t consist only of lowercase English letters.


Follow up: Suppose there are lots of incoming s, say s1, s2, ..., sk where k >= 109, and you want to check one by one to see if t has its subsequence. In this scenario, how would you change your code?*/

fun main() {
    println(isSubsequence("acb","ahbgdc"))
    println(optimalIsSubsequence("acb","ahbgdc"))
}

fun isSubsequence(s: String, t: String): Boolean {

    var counter:Int = 0
    var index = -1

    if (s.isNotEmpty() && t.isNotEmpty()){
        for (i in 0..s.length - 1){
            for (j in i..t.length - 1){
                if (s[i] == t[j] && j>index){
                    counter++
                    index = j
                    break
                }
            }
        }
    }
    if (counter == s.length){
        return true
    }
    return false
}

fun optimalIsSubsequence(s: String, t: String): Boolean {
    if (s.isEmpty()) return true
    var lastOfS = 0

    for (i in t.indices) {
        if (t[i] == s[lastOfS]) {
            lastOfS++
        }

        if (lastOfS == s.length) {
            return true
        }
    }
    return false

}