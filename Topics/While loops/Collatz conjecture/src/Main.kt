fun main() {
    var n = readLine()!!.toInt()
    println(n)
    while (n > 1) {
        if (n % 2 == 0) {
            n /= 2
            println(n)
        } else {
            n *= 3
            n += 1
            println(n)
        }
    }
}