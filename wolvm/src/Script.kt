import com.sun.istack.internal.NotNull

fun parse(code: String)
{
    @NotNull
    val string_expressions = code.split(';')
    for (expr in string_expressions)
    {
        var current = expr[0]
    }
}
