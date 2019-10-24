package lesson4_Classes

// Inheritance
open class Book (val title: String, val author: String) {

    private var currentPage = 1

    open fun readPage() {
        currentPage++
        println("currentPage: $currentPage")
    }
}

class eBook(title: String, author: String, var format: String = "text"): Book(title, author) {

    private var wordsRead = 0

    override fun readPage() {
        wordsRead += 250
        println("wordsRead: $wordsRead")
    }
}

fun main() {
    val ebook = eBook("Title", "Author")
    println("${ebook.title} ${ebook.author} ${ebook.format}")

    ebook.readPage()
    ebook.readPage()
}

