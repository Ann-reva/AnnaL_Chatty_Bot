fun main() {
    val input1 = readLine()!!.toString()
    val input2 = readLine()!!.toInt()
    val symbol = input1 [input2 - 1]
    print("Symbol # " + input2 + " of the string \"" + input1 + "\" is \'" + symbol + "\'")
}