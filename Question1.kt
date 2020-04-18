/*
Create a function in Kotlin which has a string and an array
which contains the index of all the vowels present in that
string. Print the array, and then calculate the sum of all
the values of the array. Use the string: “I am a Kotlin programmer now
*/

fun main()
{
    val str : String="I am a Kotlin programmer now"

    var index = arrayOf(2,5,8,11,16,19,22,26)

    println(sumVowelIndex(str,index))
}
fun sumVowelIndex(str : String , index : Array<Int>) : Int
{
    var sum : Int = 0
    for (i in index.indices)
    {
        println(index[i])
        sum+=index[i]
    }
    return sum
}