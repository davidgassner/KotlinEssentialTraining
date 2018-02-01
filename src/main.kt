fun main(args: Array<String>) {
    var num1 = 15
    val num2 = 10

    val sum = num1 + num2
    println("sum: $sum")
    val sum2 = num1.plus(num2)
    println("sum2: $sum2")

    val diff = num1 - num2
    println("diff: $diff")

    num1 ++
    println("num1: $num1")

    val num3 = num1.inc()
    println("num1: $num3")

    println("the value of n1 = ${++num1}")
    println ("num1=$num1")

}