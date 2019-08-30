package classes

import wolvm.*

class wolLink : wolVoid() {
    override val strtype: String
        get() = "Link"
    lateinit var address: String
}