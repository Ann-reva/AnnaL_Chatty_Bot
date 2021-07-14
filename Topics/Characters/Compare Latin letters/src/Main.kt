fun main() {
    val char1 = readLine()!!.first()
    val char2 = readLine()!!.first()
    val result = char1.equals(char2, ignoreCase = true).apply {
        println(this)
    }
}