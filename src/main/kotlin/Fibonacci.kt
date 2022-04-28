import org.junit.jupiter.api.Assertions

fun fib(n: Int): Int {
    if (n == 0) {
        return 0
    }
    if (n == 1) {
        return 1
    }
    var prev = 0
    var current = 1
    for (i in 2 until n) {
        val nextValue = prev + current
        prev = current
        current = nextValue
    }
    return current
}

fun main() {
    Assertions.assertTrue(fib(9) == 21)
    Assertions.assertTrue(fib(10) == 34)
    Assertions.assertTrue(fib(1) == 1)
    Assertions.assertTrue(fib(2) == 1)
}
