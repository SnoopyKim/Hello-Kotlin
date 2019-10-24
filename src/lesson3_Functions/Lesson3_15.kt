package lesson3_Functions

// Compact Functions
fun main(args: Array<String>) {
    println(whatShouldIDoToday2("happy"))
    println(whatShouldIDoToday2("sad", "rainy"))
    println("How do you feel?")
    println(whatShouldIDoToday2(readLine()!!))

    var fortune: String = "";
    while (!fortune.contains("Take it easy")) {
        fortune = getFortune(getBirthday())
        println("\nYour fortune is: $fortune")
    }
}

fun whatShouldIDoToday2(
    mood: String,
    weather: String = "sunny",
    temperature: Int = 24) : String {

    return when {
        isHappySunny(mood, weather) -> "Go for a walk"
        isSadRainyCold(mood, weather, temperature) -> "stay in bed"
        isVeryHot(temperature) -> "go swimming"
        else -> "Stay home and read."
    }
}

fun isHappySunny (mood: String, weather: String)
        = mood == "happy" && weather == "sunny"
fun isSadRainyCold (mood: String, weather: String, temperature: Int)
        = mood == "sad" && weather == "rainy" && temperature == 0
fun isVeryHot (temperature: Int) = temperature > 35