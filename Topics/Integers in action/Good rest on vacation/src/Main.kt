fun main() {
    val duration = readLine()!!.toInt()
    val food = readLine()!!.toInt()
    val flight = readLine()!!.toInt()
    val hotel = readLine()!!.toInt()
    val sum = duration * food + (duration - 1) * hotel + flight * 2
    println(sum)
}