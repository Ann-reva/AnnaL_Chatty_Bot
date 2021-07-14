fun main() {
    val n = readLine()!!.toInt()
    var larger = 0
    var smaller = 0
    var perfect = 0
    repeat(n) {
        val data = readLine()!!.toInt()
        if (data > 0) {
            larger += 1
        } else if (data < 0) {
             smaller += 1
            } else {
                perfect += 1
        }
    }
    println("$perfect $larger $smaller")
}