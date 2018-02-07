import model.ClothingItem
import model.Person
import java.text.NumberFormat
import java.util.*

fun main(args: Array<String>) {
    val item = ClothingItem("Shirt", "L", 19.99)
    println(item)

    item.price = 15.99
    println(item)

    val item2 = ClothingItem("M", 14.99)
    println(item2)
    println("Item type = ${item2.type}")

    item2.price = 10.0
    val f = "%.2f"
    println("Item price = $${f.format(item2.price)}")

    Locale.setDefault(Locale.FRANCE)
    val formatter = NumberFormat.getCurrencyInstance()
    println("Item price = ${formatter.format(item2.price)}")

    val person = Person("Joe", "Smith")
    println("That person is ${person.fullName}")
}
