package utils
import wolvm.*

abstract class VMLibrary {
    var stack = Stack()
    var vmexpressions = mutableListOf<VMExpression>()

    fun Load()
    {
        mainstack.Add(stack)
        expressions.addAll(vmexpressions)
    }
}