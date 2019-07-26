package utils
import wolvm.*

abstract class VMLibrary {
    var stack = Stack()
    var expressions = mutableListOf<VMExpression>()

    fun Load()
    {
        mainstack = stack

    }
}