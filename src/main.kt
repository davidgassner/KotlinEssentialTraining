import model.ClothingItem

fun main(args: Array<String>) {
    var colorSet = mutableSetOf("Red", "Green", "Blue")
    println(colorSet)

    colorSet.add("Purple")
    colorSet.remove("Green")
    println(colorSet)

    val colorList = colorSet.toMutableList()
    colorList.removeAt(0)
    println(colorList)
    colorList.add("Purple")
    println(colorList)

    val newSet = colorList.toMutableSet()
    println(newSet)

    val itemSet = mutableSetOf<ClothingItem>()
    itemSet.add(ClothingItem("Shirt", "XL", 14.99))
    itemSet.add(ClothingItem("Shirt", "M", 14.99))
    println(itemSet)
}
