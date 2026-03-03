fun main() {
    val numbers = listOf(12, 45, 7, 89, 23, 56)
    if (numbers.isEmpty()) return

    var max = numbers[0]
    for (num in numbers) {
        if (num > max) {
            max = num
        }
    }
    println("The maximum number is: $max")
}