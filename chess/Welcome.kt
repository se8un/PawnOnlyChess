package chess

class Welcome {
    fun welcome() {
        val printChessBoard = PrintChessBoard()

        println("Pawns-Only Chess")

        println("First Player's name:")
        playerW = readln()

        println("Second Player's name:")
        playerB = readln()

        printChessBoard.printChessBoard()
    }
}