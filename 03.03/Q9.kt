fun main() {
    val target = 7
    var guess: Int? = null
    
    while (guess != target) {
        print("Guess a number between 1 and 10: ")
        guess = readLine()?.toIntOrNull()
        
        if (guess == target) {
            println("Correct!")
        } else {
            println("Try again.")
        }
    }
}