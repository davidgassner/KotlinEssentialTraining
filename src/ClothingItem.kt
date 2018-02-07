data class ClothingItem(private var _type: String?,
                        val size: String,
                        private var _price: Double) {

    var type: String? = _type
        get() = field ?: "Unknown"

    var price = _price
        set(value) {
            field = value * .9
        }

    constructor(size: String, price: Double) : this(null, size, price)

}