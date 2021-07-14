fun main() {
    val n = readLine()!!.toInt()
    var max = 100_000
    repeat(n) {
        val number = readLine()!!.toInt()
        if (number < max) {
            max = number
        }
    }
    println(max)
}