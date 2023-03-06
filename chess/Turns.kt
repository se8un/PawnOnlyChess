package chess

import kotlin.system.exitProcess

class Turns {
    fun turn() {
        println("$player's turn:")
        val turn = readln()

        if (turn == "exit") {
            println("Bye!")
            exitProcess(ZERO)
        } else if (!turn.matches(chessMoveRegex)) {
            println("Invalid Input")
            turn()
        }

        // e2e4 -> 4143
        val turnToDigit = turn.map { if (it.isDigit()) it.toString().toInt() - 1 else it.lowercaseChar() - 'a' }

        fL = turnToDigit[0]
        fD = turnToDigit[1]
        sL = turnToDigit[2]
        sD = turnToDigit[3]
        start = board[fD][fL]
        end = board[sD][sL]
    }
}