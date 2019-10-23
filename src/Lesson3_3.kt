import java.util.Calendar

// Main Function
fun main(args: Array<String>) {
    println("Hello, world!")
    dayOfWeek()
}

fun dayOfWeek() {
    println("What day is it today?")
    val day : Int? = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
    println("It's " + when (day) {
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "Get Wrong Date"
    } + "!")
}