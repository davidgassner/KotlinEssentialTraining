fun main(args: Array<String>) {
    var aString = "Hello!"
    println(aString)

    val empty = String()
    println("'$empty'")

    val charArray = aString.toCharArray()
    println(charArray.toList())
    val byteArray = aString.toByteArray()
    println(byteArray.toList())

    aString += " and Welcome!"
    println(aString)

    val len = aString.length
    for (i in 0 until len) {
        val c = aString.get(i)
        println(c)
    }

    val p = aString.indexOf("W")
    val sub = aString.substring(p)
    println(sub)

    val string2 = aString.toUpperCase()
    val match = aString.equals(string2, true)
    println("Do they match? $match")
}