package chess

class PrintChessBoard {
    fun printChessBoard() {
        val pm = "  +---+---+---+---+---+---+---+---+"
        for (i in board.indices) {
            println("$pm\n${CELLS - i} | ${board[CELLS - 1 - i].joinToString(" | ")} |")
        }
        println("$pm\n" + "    " + ('a'..'h').joinToString("   ") + "\n")
    }
}