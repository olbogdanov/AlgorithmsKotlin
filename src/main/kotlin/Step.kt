/// Write a function that accepts a positive namber N.
/// The function should console log a step shape with N levels
/// using the # character. The step has spaces on the right hand side!
/// example
/// steps(3)
/// "#   "
/// "## "
/// "###"

fun steps(n: Int) {
    val listSteps = MutableList(n) { " " }
    for (i in 0 until n) {
        listSteps[i] = "#"
        println(listSteps.joinToString(""))
    }
}

fun main() {
    steps(3)
}