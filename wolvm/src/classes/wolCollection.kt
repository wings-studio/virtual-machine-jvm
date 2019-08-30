package classes

import wolvm.*

open class wolCollection: wolVoid() {
    override val strtype: String
        get() = "Collection"
    lateinit var generic_type: wolClass
}