package wolvm

fun parse(code: String)
{
    val string_expressions = code.split(';')
    for (expr in string_expressions)
    {
        var position = 0
        var current = expr[0]
        while (!current.isWhitespace())
        {
            try
            {
                current = expr[++position]
            }
            catch (e: IndexOutOfBoundsException)
            {
                throwVMException("End of expression not found", position, ExceptionType.BLDSyntaxException)
            }
        }
    }
}
