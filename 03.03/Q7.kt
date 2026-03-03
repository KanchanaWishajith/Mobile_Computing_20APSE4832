fun main() {
    val n = 5
    var factorial: Long = 1
    for (i in 1..n) {
        factorial *= i
    }
    println("Factorial of $n is: $factorial")
}