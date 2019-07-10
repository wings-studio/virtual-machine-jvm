const val version: String = "1.0.0.0"

fun main(args: Array<String>)
{
    if (args.size == 0)
    {
        print("World of Legends Virtual Machine v${version}\nAuthor: snaulX, mnolimp\nCopyright (c) 2019")
    }
    else
    {
        if (args[0] == "-info")
        {
            //pass
        }
        else if (args[0] == "-run")
        {
            //pass
        }
        else
        {
            //pass
        }
    }
}