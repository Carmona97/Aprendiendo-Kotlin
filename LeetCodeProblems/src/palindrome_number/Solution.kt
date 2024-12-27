package palindrome_number


/*Given an integer x, return true if x is a
palindrome
, and false otherwise.



Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.


Constraints:

-231 <= x <= 231 - 1*/

fun main(){
    if (isPalindrome(121)){
        print("Es palindromo")
    }else{
        print("No es palindromo")
    }

}

fun isPalindrome(x: Int): Boolean {

    var isPalindrome:Boolean = false
    val xTemp:String
    val xReversed = StringBuilder()

    xTemp = x.toString()
    for (i in xTemp.lastIndex downTo 0){
        xReversed.append(xTemp[i])
    }

    when{
        xTemp == xReversed.toString() -> isPalindrome = true
    }

    return isPalindrome
}