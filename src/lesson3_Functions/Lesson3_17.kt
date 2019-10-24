package lesson3_Functions

// Kotlin Filters
fun main(args: Array<String>) {
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )
    println(spices)

    val sortedSpices = spices.filter { it.contains("curry") }.sortedBy { it.length }
    println(sortedSpices)

    val filteredSpices = spices.filter { it.startsWith('c') && it.endsWith('e') }
    println(filteredSpices)

    val filteredSpices2 = spices.take(3).filter { it.startsWith('c') }
    println(filteredSpices2)

}