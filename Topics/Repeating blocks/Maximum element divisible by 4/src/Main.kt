fun main() {
    val n = readLine()!!.toInt()
    var max = 0

    repeat(n) {
        val input = readLine()!!.toInt()
        if (input % 4 == 0 && input > max) {
            max = input
        }
    }
            println(max)
    }