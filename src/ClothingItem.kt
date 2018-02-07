data class ClothingItem (var type: String?,
                         val size: String,
                         var price: Double) {
    init {
        type = type?.toUpperCase() ?: "UNKNOWN"
    }

    constructor(size: String, price: Double) : this(null, size, price){
//        type = "Unknown"
    }

}