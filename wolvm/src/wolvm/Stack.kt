package wolvm

import java.lang.*

class Stack {
    var classes: Map<String, wolClass> = emptyMap()
    var functions: Map<String, wolFunction> = emptyMap()
    var variables: Map<String, wolValue> = emptyMap()

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
}