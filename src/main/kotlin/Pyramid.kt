// Pyramid has spaces on both the left and right hand sides
// Examples
// pyramid(4)
// "   #   "
// "  ###  "
// " ##### "
// "#######"

fun main() {
    pyramid(10)
}

fun pyramid(levels: Int) {
    val levelSize = levels * 2 - 1
    for (i in 1.. levelSize) {
        println(" ".repeat(levelSize - i)
                + "#".repeat(i*2-1)
                + " ".repeat(levelSize - i))
    }
}
