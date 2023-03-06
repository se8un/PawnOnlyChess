package chess

import kotlin.system.exitProcess

class CheckEndGame {
    fun checkEndGame() {
        val isValidMove = IsValidMove()

        var whitePawnCount = 0
        var blackPawnCount = 0
        var whiteMoveCount = 0
        var blackMoveCount = 0

        for (i in board.indices) {
            for (j in board[i].indices) {
                val piece = board[i][j]

                if (piece == W) {
                    whitePawnCount++
                    if (isValidMove.isValidWhiteMove(i, j)) {
                        whiteMoveCount++
                    }
                }

                if (piece == B) {
                    blackPawnCount++
                    if (isValidMove.isValidBlackMove(i, j)) {
                        blackMoveCount++
                    }
                }
            }
        }

        if (whitePawnCount == 0 || fD == W_START && sD == W_START - 1 && fL == sL) {
            println("\nBlack Wins!\nBye!")
            exitProcess(ZERO)
        }

        if (blackPawnCount == 0 || fD == B_START && sD == B_START + 1 && fL == sL) {
            println("\nWhite Wins!\nBye!")
            exitProcess(ZERO)
        }

        if (whitePawnCount > 0 && blackPawnCount > 0 && (whiteMoveCount == 0 || blackMoveCount == 0)) {
            println("\nStalemate!\nBye!")
            exitProcess(ZERO)
        }

    }
}