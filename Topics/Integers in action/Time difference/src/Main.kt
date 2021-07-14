fun main() {
    val h1 = readLine()!!.toInt()
    val m1 = readLine()!!.toInt()
    val s1 = readLine()!!.toInt()
    val result1 = s1 + m1 * 60 + h1 * 60 * 60
    val h2 = readLine()!!.toInt()
    val m2 = readLine()!!.toInt()
    val s2 = readLine()!!.toInt()
    val result2 = s2 + m2 * 60 + h2 * 60 * 60
    val result = result2 - result1
    println(result)
}