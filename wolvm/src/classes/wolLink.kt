package classes

import wolvm.*

class wolLink : wolVoid() {
    override val strtype: String
        get() = "Link"
    var address: String = "null"
    var LinkedValue: wolValue = wolValue.VoidValue
}