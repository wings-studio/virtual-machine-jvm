import com.sun.istack.internal.NotNull

fun parse(code: String)
{
    @NotNull
    val string_expressions = code.split(';')
    for (expr in string_expressions)
    {
        var position = 0
        var current = expr[0]
        while (current.isJavaIdentifierPart())
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
