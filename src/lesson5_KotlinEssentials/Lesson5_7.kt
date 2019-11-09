package lesson5_KotlinEssentials

const val MAX_NUMBER_BOOKS = 20

object Constants {
    const val BASE_URL = "http://www.turtlecare.net/"
}

class BookVer2(val title: String, val author: String, val year: Int) {
    companion object {
        val BASE_URL = "http://www.turtlecare.net/"
    }

    fun getTitleAuthor(): Pair<String, String> {
        return (title to author)
    }

    fun getTitleAuthorYear(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }

    fun canBorrow(hasBooks: Int): Boolean {
        return (hasBooks < MAX_NUMBER_BOOKS)
    }

    fun printUrl() { println(BASE_URL + "Snoopy Story" + ".html") }

}