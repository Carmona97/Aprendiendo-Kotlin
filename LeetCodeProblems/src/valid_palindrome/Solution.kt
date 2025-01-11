package valid_palindrome

/*A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.



Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.


Constraints:

1 <= s.length <= 2 * 105
s consists only of printable ASCII characters.*/

fun main() {
    println(isPalindromeOptimal("A man, a plan, a canal: Panama"))
}
fun isPalindrome(s: String): Boolean {

    val regex:Regex = Regex("[A-Za-z0-9]")
    var alphanumeric = StringBuilder()
    var inversedAlphanumeric = StringBuilder()

    if(s.equals("")) {
        return true
    }

    for (char in s){
        if (regex.matches(char.toString())){
            alphanumeric.append(char.lowercaseChar())
        }
    }
    for (i in s.length - 1 downTo 0){
        if (regex.matches(s[i].toString())){
            inversedAlphanumeric.append(s[i].lowercaseChar())
        }
    }
    if(alphanumeric.toString() == inversedAlphanumeric.toString()){
        return true
    }
    return false
}

fun isPalindromeOptimal(s: String): Boolean {
    var left = 0
    var right = s.length - 1
    while (left < right) {
        // for skipping spaces and any additional special chars from left
        while(left < right && !s[left].isLetterOrDigit()){
            left++
        }
        // for skipping spaces and any additional special chars from right
        while(right > left && !s[right].isLetterOrDigit()){
            right--
        }
        if(s[left].lowercaseChar() != s[right].lowercaseChar()){
            return false
        }
        right--
        left++
    }
    return true
}