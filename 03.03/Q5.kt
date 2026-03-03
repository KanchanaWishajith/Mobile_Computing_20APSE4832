fun main() {
    val originalList = listOf(1, 2, 2, 3, 4, 4, 5, 1)
    val uniqueList = mutableListOf<Int>()
    
    for (item in originalList) {
        if (item !in uniqueList) {
            uniqueList.add(item)
        }
    }
    println("List without duplicates: $uniqueList")
}