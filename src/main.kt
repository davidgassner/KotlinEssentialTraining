fun main(args: Array<String>) {
    val states = arrayOf("CA", "OR", "WA")

    printHeader("While loop")
    var counter = 0
    while (counter < states.size) {
        println("Counter = $counter")
        println("State = ${states.get(counter)}")
        counter ++
    }

    counter = 0
    printHeader("Do / While loop")
    do {
        println("State = ${states.get(counter)}")
        counter ++
    } while (counter < states.size)
}

fun printHeader(label: String) {
    println("***************")
    println(label)
    println("***************")
}
