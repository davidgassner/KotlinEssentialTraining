fun main(args: Array<String>) {
    try {
        print("Number 1: ")
        val string1: String? = readLine()
        val number1 = string1!!.toDouble()

        print("Number 2: ")
        val string2 = readLine()
        val number2 = string2!!.toDouble()

        val result: Double? = addValues(number1, number2)
        println("The answer is $result")
    } catch (e: NumberFormatException) {
        println("${e.message} is not a number")
    } catch (e: Exception) {
        println(e.message)
    }
}

fun addValues(number1: Double, number2: Double) = number1 + number2
