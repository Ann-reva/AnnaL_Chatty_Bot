fun main() {
    val squirrels = readLine()!!.toInt()
    val nuts = readLine()!!.toInt()
    val leftNuts = nuts % squirrels
    println(leftNuts)
}


