fun main(args: Array<String>) {
    try {
        val number1 = MathLib.getInput("Number 1: ")
        val number2 = MathLib.getInput("Number 2: ")

        print("Select an operation (${MathLib.OPERATIONS}): ")
        val operation = readLine()

        val result: Double? =
                when (operation) {
                    MathLib.ADD -> MathLib.addValues(number1, number2)
                    MathLib.SUBTRACT -> MathLib.subtractValues(number1, number2)
                    MathLib.MULTIPLY -> MathLib.multiplyValues(number1, number2)
                    MathLib.DIVIDE -> MathLib.divideValues(number1, number2)
                    else -> throw Exception("Unknown operation")
                }
        println("The answer is $result")
    } catch (e: NumberFormatException) {
        println("${e.message} is not a number")
    } catch (e: Exception) {
        println(e.message)
    }
}
