fun main(args: Array<String>) {
    val num1 = 4.0
    val num2 = 3.5

    val result = addValues(param2 = num2, param1 = num1)
    println("the result is $result")

    val result2 = calcValues(num1, num2, "-")
    println("Result 2 is $result2")

    changeSomething(5.0)

    val sum: Int = addValues(1, 3, 5, 7)
    println("Sum=$sum")
}

fun addValues(param1: Double, param2: Double): Double {
    return param1 + param2
}

fun calcValues(param1: Double, param2: Double, op: String = "+"): Double {
    if (op.equals("+")) {
        return param1 + param2
    } else if (op.equals("-")) {
        return param1 - param2
    } else {
        return -1.0
    }
}

fun changeSomething(param: Double) {
//    param ++
    var copy = param
    copy++
    println("Copy is $copy")
}

fun addValues(vararg numbers: Int): Int {
    var result = 0
    for (i in numbers) {
        result += i
    }
    return result
}