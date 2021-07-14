fun main() {
    val length = readLine()!!.toInt()
    var sum = 0
    repeat(length) {
        val n = readLine()!!.toInt()
        if (n > 0){
            sum += 1
        }
    }
    println(sum)
}