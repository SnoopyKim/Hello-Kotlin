package lesson4_Classes

import java.awt.Color

// Special Purpose Classes
interface NewSpiceColor {
    val color: Color
}

object NewYellowSpiceColor : NewSpiceColor {
    override val color = Color.YELLOW
}

// + sealed class