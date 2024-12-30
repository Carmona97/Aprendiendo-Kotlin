package valid_parethesis
/*Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.


Example 1:

Input: s = "()"

Output: true

Example 2:

Input: s = "()[]{}"

Output: true

Example 3:

Input: s = "(]"

Output: false

Example 4:

Input: s = "([])"

'(',')','{','}','[',']'

Output: true*/
fun main() {
    println(isValid("(]"))
}

fun isValid(s: String): Boolean {
    val stack = mutableListOf<Char>()
    val matchingBrackets = mapOf(')' to '(', '}' to '{', ']' to '[')

    for (char in s) {
        when {
            char in matchingBrackets.values -> stack.add(char)
            char in matchingBrackets.keys -> {
                if (stack.isEmpty() || stack.removeAt(stack.size - 1) != matchingBrackets[char]) {
                    return false
                }
            }
            else -> return false
        }
    }

    return stack.isEmpty()
}
