package lesson5_KotlinEssentials

fun main(args: Array<String>) {
    val allBooks = setOf("KJH Story", "Snoopy Story")
    val library = mapOf("SnoopyKim" to allBooks)

    println(library)
    println(library.any { it.value.contains("Another Story") })

    val moreBooks = mutableMapOf<String, String>("Title" to "author")
    moreBooks.getOrPut("Test1") { "a1" }
    moreBooks.getOrPut("Test2") { "a2" }

    println(moreBooks)
}