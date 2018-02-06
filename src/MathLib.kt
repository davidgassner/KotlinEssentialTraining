class MathLib {

    var runningTotal = 0.0

    fun addValue(value: Double) {
        runningTotal += value
    }

    companion object {
        fun addValues(number1: Double, number2: Double) = number1 + number2

        fun getInput(prompt: String): Double {
            print(prompt)
            val string: String? = readLine()
            val number = string!!.toBigDecimal()
            return number.toDouble()
        }
    }
}