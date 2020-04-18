fun main()
{
    val str="Welcome to Goa Singham"
    val l=str.length
    println(l)

    val i=str.get(11)
    print("The character at index 11 is ")
    println(i)

    // String template

    println("The character at index 11 is $i")

    println("The character at index 11 is ${str.get(11)}")

    val s=str.subSequence(0,8)
    println(s)

    
}