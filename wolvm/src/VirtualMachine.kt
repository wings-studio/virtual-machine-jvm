import java.io.FileReader
import java.io.FileWriter

const val version: String = "1.0.0.0"
val wolVoid: wolClass = wolClass()

fun main(args: Array<String>)
{
    if (args.isEmpty())
    {
        print("World of Legends Virtual Machine v${version}\nAuthor: snaulX, mnolimp\nCopyright (c) 2019")
    }
    else
    {
        when {
            args[0] == "-info" -> {
                //pass
            }
            args[0] == "-run" -> {
                //pass
            }
            else -> {
                var reader: FileReader = FileReader(args[0])
                val input: String = reader.readText()
                //pass
            }
        }
    }
}