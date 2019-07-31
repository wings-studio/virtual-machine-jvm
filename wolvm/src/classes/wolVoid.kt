package classes
import wolvm.*

class wolVoid : wolClass("void") {
    override var type: ClassType
        get() = ClassType.STRUCT
        set(value) { value }
}