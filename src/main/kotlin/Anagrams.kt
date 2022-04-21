
fun anagrams(str1: String, str2: String): Boolean {
    val plainStr1 = str1.filter { it.isLetterOrDigit() }.lowercase()
    val plainStr2 = str2.filter { it.isLetterOrDigit() }.lowercase()

    val strMap1 = HashMap<Char, Int>()
    plainStr1.forEach {
        val count = strMap1[it] ?: 0
        strMap1[it] = count + 1
    }
    val strMap2 = HashMap<Char, Int>()
    plainStr2.forEach {
        val count = strMap2[it] ?: 0
        strMap2[it] = count + 1
    }

    return strMap1.equals(strMap2)
}

fun main() {
    println(anagrams("b aBx!", ",  babx"))
}