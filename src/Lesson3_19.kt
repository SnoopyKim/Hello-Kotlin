import java.util.Random

// Kotlin Lambdas
fun main(args: Array<String>) {
    gamePlay(rollDice(6))
    gamePlay(rollDice2(6))
}

val rollDice = { sides: Int ->
    if (sides == 0) 0
    else Random().nextInt(sides) + 1
}

val rollDice2 : (Int) -> Int = { sides: Int ->
    if (sides == 0) 0
    else Random().nextInt(sides) + 1
}

fun gamePlay (diceRoll: Int) {
    println(diceRoll)
}

