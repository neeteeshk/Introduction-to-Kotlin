fun main()
{
    val a=0
    if(a < 0 || a>0)
        println("a is a non zero integer")
    else
        println("a is equal to zero")
    val x=3
    println("Integer is $x")
    if(x>0 && x<5)
        println("The value of integer is between 0 - 5")
    else
        println("The value of integer is not between 0 - 5")

    val num=19
    when(num)
    {
        in 1..10 -> println("Between 1 - 10")
        in 11..20 -> println("Between 11 - 20")
        in 21..30 -> println("Between 21 - 30")
        else -> println("None")
    }
}