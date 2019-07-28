package utils
import wolvm.*

abstract class VMLibrary {
    var stack = Stack()
    var vmexpressions = mutableMapOf<String, VMExpression>()

    fun Load()
    {
        mainstack.Add(stack)
        expressions.putAll(vmexpressions)
    }
}