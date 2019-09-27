package classes

class wolDouble : wolFloat() {
    override val strtype: String
        get() = "double"
    var doublevalue: Double = 0.0
}