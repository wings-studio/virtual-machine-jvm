package classes

open class wolFloat : wolInt() {
    override val strtype: String
        get() = "float"
    var floatvalue: Float = 0.0f
}