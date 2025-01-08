package length_last_word

fun main() {
    println(lengthOfLastWord("   fly me   to   the moon  "))
}

fun lengthOfLastWord(s: String): Int {
    var sArray:List<String>
    var lastWordSize = 0
    sArray = s.split(' ')
    for (i in sArray.lastIndex downTo 0){
        if (!sArray[i].equals("")){
            lastWordSize = sArray[i].length
            break
        }
    }
    return lastWordSize
}