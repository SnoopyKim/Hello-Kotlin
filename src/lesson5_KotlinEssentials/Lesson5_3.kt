package lesson5_KotlinEssentials

class Book(val title: String, val author: String, val year: Int) {
    fun getTitleAuthor(): Pair<String, String> {
        return (title to author)
    }

    fun getTitleAuthorYear(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }
}

fun main(args: Array<String>) {
    val book = Book("Snoopy Story", "SnoopyKim", 20191109)
    val bookTitleAuthor = book.getTitleAuthor()
    val bookTitleAuthorYear = book.getTitleAuthorYear()

    println("The Book Title: ${bookTitleAuthor.first} by ${bookTitleAuthor.second}")
    println("The Book Title: ${bookTitleAuthorYear.first} by ${bookTitleAuthorYear.second}" +
            " written in ${bookTitleAuthorYear.third}")
}