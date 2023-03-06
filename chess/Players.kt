package chess

class Players {
    fun players() {
        val printChessBoard = PrintChessBoard()
        val checkEndGame = CheckEndGame()
        val turn = Turns()

        turn.turn()

        // White
        if (player == playerW) {
            if (start == V || start == B) {
                println("No white pawn at $start$end")
                players()
            } else if (capL != 0 && capD != 0 && fD == 4 && (sL == capL && sD == capD + 1 && (fL == capL + 1 || fL == capL - 1))) {
                board[fD][fL] = V
                board[sD][sL] = W
                board[capD][capL] = V
                capL = ZERO
                capD = ZERO
                printChessBoard.printChessBoard()
                checkEndGame.checkEndGame()
                player = playerB
                players()
            } else if (fD == 1 && sD == 3 && fL == sL && end == V && board[sD - 1][sL] == V) {
                board[fD][fL] = V
                board[sD][sL] = W
                capL = sL
                capD = sD
                printChessBoard.printChessBoard()
                checkEndGame.checkEndGame()
                player = playerB
                players()
            } else if (fD + 1 == sD && (B != board[fD + 1][fL] && fL == sL || end == B && (sL == fL + 1 || sL == fL - 1))) {
                board[fD][fL] = V
                board[sD][sL] = W
                capL = ZERO
                capD = ZERO
                printChessBoard.printChessBoard()
                checkEndGame.checkEndGame()
                player = playerB
                players()
            } else {
                println("Invalid Input")
                players()
            }
        }

        // Black
        if (player == playerB) {
            if (start == V || start == W) {
                println("No black pawn at $start$end")
                players()
            } else if (capL != 0 && capD != 0 && fD == 3 && (sL == capL && sD == capD - 1 && (fL == capL + 1 || fL == capL - 1))) {
                board[fD][fL] = V
                board[sD][sL] = B
                board[capD][capL] = V
                capL = ZERO
                capD = ZERO
                printChessBoard.printChessBoard()
                checkEndGame.checkEndGame()
                player = playerW
                players()
            } else if (fD == 6 && sD == 4 && fL == sL && end == V && board[sD + 1][sL] == V) {
                board[fD][fL] = V
                board[sD][sL] = B
                capL = sL
                capD = sD
                printChessBoard.printChessBoard()
                checkEndGame.checkEndGame()
                player = playerW
                players()
            } else if (fD - 1 == sD && (W != board[fD - 1][fL] && fL == sL || end == W && (sL == fL + 1 || sL == fL - 1))) {
                board[fD][fL] = V
                board[sD][sL] = B
                capL = ZERO
                capD = ZERO
                printChessBoard.printChessBoard()
                checkEndGame.checkEndGame()
                player = playerW
                players()
            } else {
                println("Invalid Input")
                players()
            }
        }
    }

}