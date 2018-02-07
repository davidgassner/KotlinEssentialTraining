import model.ClothingItem

fun main(args: Array<String>) {

    val colorMap = mapOf<String, Long>(
            Pair("Red", 0xFF0000),
            Pair("Green", 0x00FF00),
            Pair("Blue", 0x0000FF)
    )
    println(colorMap)
    println(colorMap::class.simpleName)

    val stateMap = mutableMapOf<String, String>()
    stateMap.put("CA", "Sacramento")
    stateMap.put("OR", "Salem")
    stateMap.put("WA", "Olympia")
    println(stateMap)

    for (state in stateMap.keys) {
        println("The capital of $state is ${stateMap.get(state)}")
    }
    for ((state, capital) in stateMap) {
        println("The capital of $state is $capital")
    }

    val cart = mutableMapOf<ClothingItem, Int>()
    cart.put(ClothingItem("Shirt", "XL", 14.99), 2)
    cart.put(ClothingItem("Pants", "32", 19.99), 4)
    cart.put(ClothingItem("Hat", "8.5", 24.00), 1)
    println(cart)


}
