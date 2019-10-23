// Practice Time
fun main(args: Array<String>) {
    println(whatShouldIDoToday("happy"))
}

fun whatShouldIDoToday(
    mood: String,
    weather: String = "Sunny",
    temperature: Int = 24) : String {

    return when {
        mood == "happy" && weather == "Sunny" -> "Go for a walk"
        else -> "Stay home and read."
    }
}