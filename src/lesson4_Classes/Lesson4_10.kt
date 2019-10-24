package lesson4_Classes

import java.awt.Color

// Abstract and Interface
abstract class ASpice (val name: String, val spiciness: String ="mild", color: SpiceColor) : SpiceColor by color {

    val heat: Int
        get() {
            return when (spiciness) {
                "mild" -> 1
                "medium" -> 3
                "spicy" -> 5
                "very spicy" -> 7
                "extremely spicy" -> 10
                else -> 0
            }
        }

    init {
        println(" ${this.name}'s spiciness level is ${this.heat}")
    }

    abstract fun prepareSpice()
}

class Curry(name: String, spiciness: String, color: SpiceColor = YellowSpiceColor) : ASpice(name, spiciness, color), Grinder {

    override fun grind() {
    }

    override fun prepareSpice() {
        grind()
    }
}

interface Grinder {
    fun grind()
}

interface SpiceColor {
    val color: String
}

object YellowSpiceColor: SpiceColor {
    override val color = "Yellow"
}
