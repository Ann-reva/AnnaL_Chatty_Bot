fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val n = readLine()!!.toInt()
    var x = 0
    var sum = 0
    for (x in a..b) {
        if (x % n == 0)
            sum++
    }
            println(sum)
}