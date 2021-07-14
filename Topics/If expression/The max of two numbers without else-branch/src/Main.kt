fun main() {

    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val max = if (a > b) {
        println(a)
        a
    } else {
            println(b)
        b
    }
}