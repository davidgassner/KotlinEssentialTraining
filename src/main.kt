import model.ClothingItem

fun main(args: Array<String>) {

    val cart = mutableMapOf<ClothingItem, Int>()
    cart.put(ClothingItem("Shirt", "XL", 14.99), 2)
    cart.put(ClothingItem("Pants", "32", 19.99), 4)
    cart.put(ClothingItem("Hat", "8.5", 24.00), 1)
    println(cart)

}
