class MathLib {
    companion object {

//        const val ADD = "+"
//        const val SUBTRACT = "-"
//        const val MULTIPLY = "*"
//        const val DIVIDE = "/"
        const val OPERATIONS = "+ - * /"

        fun addValues(number1: Double, number2: Double) = number1 + number2
        fun subtractValues(number1: Double, number2: Double) = number1 - number2
        fun multiplyValues(number1: Double, number2: Double) = number1 * number2
        fun divideValues(number1: Double, number2: Double) = number1 / number2

        fun getInput(prompt: String): Double {
            print(prompt)
            val string: String? = readLine()
            val number = string!!.toBigDecimal()
            return number.toDouble()
        }
    }
}