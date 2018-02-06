class MathLib {
    companion object {
        fun addValues(number1: Double, number2: Double) = number1 + number2

        fun getInput(prompt: String): Double {
            print(prompt)
            val string: String? = readLine()
            val number = string!!.toDouble()
            return number
        }
    }
}