fun main() {
    val numbers = listOf(-5, 10, -2, 8, 0, 3)
    var sum = 0
    for (num in numbers) {
        if (num > 0) {
            sum += num
        }
    }
    println("Sum of positive numbers: $sum")
}