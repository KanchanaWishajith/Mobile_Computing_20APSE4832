fun main() {
    val input = "Mobile Computing with Kotlin"
    val vowels = setOf('a', 'e', 'i', 'o', 'u')
    var count = 0
    
    for (char in input.lowercase()) {
        if (char in vowels) {
            count++
        }
    }
    println("Number of vowels: $count")
}