fun main(args: Array<String>) {
    val colors = arrayOf("Red", "Green", "Blue")
    val values = intArrayOf(1, 3, 5, 7, 9)

    printHeader("For each loop")
    for (color in colors) {
        println(color)
    }
    for (value in values) {
        println(value)
    }

    printHeader("For loop with indices")
    for (i in values.indices step 2) {
        println(values[i])
    }
    for (i in 0 until colors.size) {
        println(colors[i])
    }
}

fun printHeader(label: String) {
    println("***************")
    println(label)
    println("***************")
}