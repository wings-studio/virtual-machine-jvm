class Stack {
    var classes: Map<String, wolClass> = emptyMap()
    var functions: Map<String, wolFunction> = emptyMap()
    var variables: Map<String, wolValue> = emptyMap()

    companion object Parser {
        @JvmStatic
        fun parse(code: String)
        {
            //pass
        }
    }
}