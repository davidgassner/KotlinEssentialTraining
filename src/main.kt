fun main(args: Array<String>) {
    var nullValue:String? = null
    println(nullValue)

    val l:Int? = nullValue?.length
    println("Length is $l")

    if (l == null) {
        println("Length is null")
    }

    val message = if (l != null) {
        "Length: $l"
    } else {
        "l is null"
    }
    println(message)

    val l2 = l ?: -1
    println("The value of l2 is $l2")

    try {
        val l3 = l!!
        println("The value of l3 is $l3")
    } catch (e: KotlinNullPointerException) {
        println("l3 is null")
    }

}