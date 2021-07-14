fun main() {
    val n = readLine()!!.toInt()
    var D = 0
    var C = 0
    var B = 0
    var A = 0
    repeat(n) {
        val data = readLine()!!.toInt()
        if (data == 2) {
            D += 1
        } else if (data == 3) {
            C += 1
        } else if (data == 4) {
            B +=1
        } else {
            A += 1
        }
    }
    println("$D $C $B $A")
}