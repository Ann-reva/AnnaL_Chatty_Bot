fun main() {
    val n = readLine()!!.toInt()
    var largest = n[0]
    for (num in n) {
        if (largest < n)
            largest = n
    }
    println(largest)
}
