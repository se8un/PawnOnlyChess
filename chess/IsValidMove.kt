package chess

class IsValidMove {
    fun isValidWhiteMove(i: Int, j: Int): Boolean {
        return (i + 1 in 0..7 && board[i + 1][j] == V) ||
                (j - 1 in 0..7 && board[i][7] == W && board[i + 1][j - 1] == B) ||
                (j + 1 in 0..7 && board[i][0] == W && board[i + 1][j + 1] == B) ||
                (i + 1 in 0..7 && j - 1 in 0..7 && j + 1 in 0..7 &&
                        (board[i + 1][j - 1] == B && board[i + 1][j + 1] == B ||
                                board[i + 1][j - 1] == B || board[i + 1][j + 1] == B))
    }

    fun isValidBlackMove(i: Int, j: Int): Boolean {
        return (i - 1 in 0..7 && board[i - 1][j] == V) ||
                (j - 1 in 0..7 && board[i][7] == B && board[i - 1][j - 1] == W) ||
                (j + 1 in 0..7 && board[i][0] == B && board[i - 1][j + 1] == W) ||
                (i - 1 in 0..7 && j - 1 in 0..7 && j + 1 in 0..7 &&
                        (board[i - 1][j - 1] == W && board[i - 1][j + 1] == W ||
                                board[i - 1][j - 1] == W || board[i - 1][j + 1] == W))
    }

}