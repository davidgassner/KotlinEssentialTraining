fun main(args: Array<String>) {
    print("Enter a state abbreviation: ")
    val state = readLine()

    if (state == "CA") println("The capital is Sacramento")
    else if (state == "OR") println("The capital is Salem")
    else println("I don't know that state")
}