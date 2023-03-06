package chess

const val V = " "
const val W = "W"
const val B = "B"
const val W_START = 1
const val B_START = 6
const val CELLS = 8
const val ZERO = 0

val board = Array(CELLS) { r -> Array(CELLS) { if (r == B_START) B else if (r == W_START) W else V } }
val chessMoveRegex = Regex("[a-h][1-8][a-h][1-8]")

var playerW = ""
var playerB = ""
var player = ""
var fL = 0
var fD = 0
var sL = 0
var sD = 0
var start = board[fD][fL]
var end = board[sD][sL]
var capL = ZERO
var capD = ZERO

fun main() {
    val players = Players()
    val welcome = Welcome()
    welcome.welcome()
    player = playerW
    players.players()
}