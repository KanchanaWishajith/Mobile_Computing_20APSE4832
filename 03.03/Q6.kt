fun main() {
    val items = listOf("Apple", "Banana", "Cherry")
    val reversedItems = mutableListOf<String>()
    
    for (i in items.size - 1 downTo 0) {
        reversedItems.add(items[i])
    }
    println("Reversed list: $reversedItems")
}