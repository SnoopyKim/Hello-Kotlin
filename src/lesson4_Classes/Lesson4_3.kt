package lesson4_Classes

// Defining Classes
class SimpleSpice() {
    val name: String = "curry"
    val level: String = "mild"
    val heat: Int
        get() { return 5 }
}

fun main(args: Array<String>) {
    val simpleSpice = SimpleSpice()
    println("${simpleSpice.name} ${simpleSpice.heat}")
}