package wolvm

import java.lang.*

class Stack {
    var classes: MutableMap<String, wolClass> = mutableMapOf()
    var functions: MutableMap<String, wolFunction> = mutableMapOf()
    var variables: MutableMap<String, wolValue> = mutableMapOf()

    companion object Parser {
        @JvmStatic
        fun parse(code: String): Stack
        {
            var stack = Stack()
            var position = 0
            var current = code[0]
            while (current.isWhitespace()) //skip whitespaces
            {
                try
                {
                    current = code[++position]
                }
                catch (e: IndexOutOfBoundsException)
                {
                    throwVMException("Start of stack not found", position, ExceptionType.BLDSyntaxException)
                }
            }
            if (current == '{')
            {
                current = code[++position] //go to next character
            }
            else
            {
                throwVMException("Open bracket is not valid $current", position, ExceptionType.BLDSyntaxException)
            }
            return stack
        }
    }

    fun Add(stack: Stack)
    {
        for (wolclass in stack.classes)
        {
            classes[wolclass.key] = wolclass.value
        }
        for (function in stack.functions)
        {
            functions[function.key] = function.value
        }
        for (variable in stack.variables)
        {
            variables[variable.key] = variable.value
        }
    }
}
