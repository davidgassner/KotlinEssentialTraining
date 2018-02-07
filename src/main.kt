fun main(args: Array<String>) {

    val array1 = arrayOf("Red", "Green", "Blue")
    for (element in array1) {
        println(element)
    }
    val mixed = arrayOf("A String", 12)
    for (element in mixed) {
        println(element)
    }

    val nulls = arrayOfNulls<String>(3)
    for (element in nulls) {
        println(element)
    }
    nulls[0] = "Red"
    nulls[1] = "Blue"
    nulls[2] = "Green"
    for (element in nulls) {
        println(element)
    }

    val intArray = intArrayOf(3, 4, 5)
    for (element in intArray) {
        println(element)
    }

    array1.sort()
    for (element in array1) {
        println(element)
    }

    val array4 = array1.sortedArrayDescending()
    for (element in array4) {
        println(element)
    }


}
