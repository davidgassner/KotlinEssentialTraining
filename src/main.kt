fun main(args: Array<String>) {
    try {
        val number1 = MathLib.getInput("Number 1: ")
        val number2 = MathLib.getInput("Number 2: ")
        val result: Double? = MathLib.addValues(number1, number2)
        println("The answer is $result")
    } catch (e: NumberFormatException) {
        println("${e.message} is not a number")
    } catch (e: Exception) {
        println(e.message)
    }
}
