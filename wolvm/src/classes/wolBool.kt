package classes
import wolvm.*

class wolBool : wolVoid() {
    override val strtype: String
        get() = "bool"
    var value: Boolean = false
}