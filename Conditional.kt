fun main()
{
    val a=10
    val b=0
    if(b==0)
    {
        println("divison not possible")
    }
    else
    {
        println(a/b)
    }
    greater(20,10)
    printMaximum(30,40)

    val maxValue : Int = if(a>b) {
        a
    }
    else {
        b
    }
    println(maxValue)





    nestedIf()

}
fun greater(a : Int ,b : Int)
{
    if(a>b)
    {
        println("$a is greater than $b  !")
    }
    else if(a<b)
    {
        println("$b is greater than $a  !")
    }
    else
    {
        println("both are equal")
    }
}
fun printMaximum(x : Int , y : Int)
{
    var maxValue : Int
    if(x>y)
        maxValue=x
    else
        maxValue=y
    println(maxValue)
}
fun nestedIf()
{
    val a=11
    val b=10
    if(a>b)
        println("a is greater than b")
    else if(a<b)
        println("b is greater than a")
    else
        println("both are equal")
}