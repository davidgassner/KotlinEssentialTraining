fun main(args: Array<String>) {

    val buster = Retriever()
//    buster.speak()
    makeItTalk(buster)
    reportBreed("Buster", buster)
}

fun makeItTalk(dog: Retriever) {
    dog.speak()
}

fun reportBreed(name: String, dog: Dog) {
    println("$name is a ${dog::class.simpleName}")
    println("This dog's fur is ${dog.fur}")
}

interface Dog {
    var fur: String
    fun speak() {
        println("Woof!")
    }
}

interface Cat{
    var fur: String
    fun speak() {
        println("Meow!")
    }
}

class Retriever : Dog, Cat {
    override var fur: String
        get() = "golden"
        set(value) {}

    override fun speak() {
        super<Dog>.speak()
        super<Cat>.speak()
    }
}
