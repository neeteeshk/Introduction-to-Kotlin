//Create a program in Kotlin to calculate the factorial of number 7.
fun main() {

    // write your code here
    val num=7
    var fact=1
    for (i in 7 downTo 1)
    {
        fact*=i
    }

    println(fact)
}