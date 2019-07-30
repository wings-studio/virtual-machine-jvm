package classes
import wolvm.*

class wolVoid : wolClass() {
    override var type: ClassType
        get() = ClassType.STRUCT
        set(value) { value }
}