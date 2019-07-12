import java.io.FileReader
import java.lang.StringBuilder

const val version: String = "1.0.0.0"
val wolVoid: wolClass = wolClass()

fun throwVMException(message: String, position: Int, type: ExceptionType) = println("$type. In position $position. $message")

fun main(args: Array<String>)
{
    if (args.isEmpty())
    {
        print("World of Legends Virtual Machine v$version\nAuthor: snaulX, mnolimp\nCopyright (c) 2019")
    }
    else
    {
        when {
            args[0] == "-info" -> {
                print("World of Legends Virtual Machine v$version\nAuthor: snaulX, mnolimp\nCopyright (c) 2019")
            }
            args[0] == "-run" -> {
                //pass
            }
            else -> {
                var reader: FileReader = FileReader(args[0])
                val input: String = reader.readText()

                //main cycle
                var position: Int = 0
                var current: Char = input[position]
                while (position < input.length)
                {
                    while (current.isWhitespace()) //skip whitespaces
                    {
                        try {
                            current = input[++position]
                        }
                        catch (ex: IndexOutOfBoundsException)
                        {
                            throwVMException("End of parsing not found", position, ExceptionType.BLDSyntaxException)
                            break
                        }
                    }
                    var buffer: StringBuilder = StringBuilder()
                    while (!current.isWhitespace()) //get word
                    {
                        try {
                            buffer.append(current)
                            current = input[++position]
                        }
                        catch (ex: IndexOutOfBoundsException)
                        {
                            throwVMException("End of parsing not found", position, ExceptionType.BLDSyntaxException)
                        }
                    }
                    when (buffer.toString())
                    {
                        "end" -> return
                        else ->
                            throwVMException("Unknown keyword $buffer", position, ExceptionType.BLDSyntaxException)
                    }
                }
            }
        }
    }
}