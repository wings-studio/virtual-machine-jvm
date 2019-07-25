package utils
import wolvm.*

abstract class VMLibrary {
    var classes = emptyList<wolClass>()
    var expressions = emptyList<VMExpression>()

    fun Load()
    {
        //pass
    }
}