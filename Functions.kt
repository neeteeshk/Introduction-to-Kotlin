fun sum(a : Int,b : Int) : Int
{
    return  a+b;
}
fun iAmFunction() : Unit  //default return type is Unit
{
    println("Welcome to functions in kotlin")
}
fun main()
{
    var a=10
    var b=20
    iAmFunction()
    println(sum(a,b))
    println(timesTwo(23))
    println(timesThree(40))
    println(timesFour(25))
    println(timesFourBlockBody(50))
}
fun timesTwo(x : Int) : Int{
    return  2*x
}
fun timesThree(x : Int) = 3*x
fun timesFour(x : Int)=4*x
fun timesFourBlockBody(x : Int) : Int
{
    return 4*x
}
