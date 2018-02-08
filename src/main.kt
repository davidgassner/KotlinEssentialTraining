fun main(args: Array<String>) {

    val helloWorld = {
        println("Hello world!")
    }
    helloWorld()
    helloWorld.invoke()

    val sayHello = {
        user: String, age: Int -> println("Hello, $user, you're $age years old!")
    }
    sayHello("David", 39)

    val states = arrayOf("New York", "New Hampshire", "Vermont",
            "Rhode Island", "Nebraska")
//    val sorted = states.sortedBy { state -> state.length }
    val sorted = states.sortedBy { it.length }
            .filter { it.startsWith("n", true) }
    for (state in sorted) {
        println(state)
    }
}
