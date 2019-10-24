package lesson4_Classes

// Data Classes
data class SpiceContainer (var spice: ASpice) {
    val label = spice.name
}

fun main() {
    val spiceCabinet = listOf(
        SpiceContainer(Curry("Yellow Curry", "mild")),
        SpiceContainer(Curry("Red Curry", "medium")),
        SpiceContainer(Curry("Green Curry", "spicy")))

    for(element in spiceCabinet) println(element.label)
}
