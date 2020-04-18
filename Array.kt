import java.util.*

// An array is a data structure that contains group of element
fun main()
{
    //nameOfArray=arrayOf<Type>(elements)
    var vowel=arrayOf<Char>('a','e','i','o','u')

    val charArray=arrayOf<Char>('a','b','c','d','e')

    //it is possible to change elements of val type array but it cannit be replaced with different array

    // YOU CAN NOT CHANGE THE SIZE OF EITHER (VAR OR VAL) ARRAYS

    // YOU CAN ALSO DECLARE ARRAY IN SIMPLER FORM i.e., No need to write type of array
    var naturalNumber=arrayOf(0,1,2,3,4,5,6,7,8,9)

    val newArr : Array<Any> = arrayOf("Hello",100,20.5,'a',true)


    // MORE ABOUT ARRAY
    var stringArray : Array<String> = arrayOf("Hello","Kotlin","Programmers")

    println(stringArray.get(0))
    //this function return the value of array stored at index 0

    println(stringArray[0])


    // Array is mutable
    println(stringArray[1])
    stringArray[1]="my new string"
    println(stringArray[1])

    println(stringArray.size)

    // we cannot change the size of array


    println(Arrays.toString(stringArray))

    // Define an array with the contents (1, 2, 3, 4) and print it using the Arrays.toString() function.

    var arr : Array<Int> = arrayOf(1,2,3,4)
    println(Arrays.toString(arr))

    //Create an array of the first five natural numbers and all boolean values
    val arrBool : Array<Boolean> = arrayOf(true,false,true,true,false)



    /* Create two arrays, one with the first 5 even numbers and another with first 5
     odd numbers and add each element of the first array with every corresponding element of the second array. */
    val first : Array<Int> =arrayOf(2,4,6,8,10)
    val second : Array<Int> = arrayOf(1,2,3,4,5)
    for (i in 0..4) {
        println(first[i]+second[i])
    }

    //Calculate the size of the array with elements [1,2,3,5,6,7,9,4].
    val a : Array<Int> = arrayOf(1,2,3,5,6,7,9,4)
    println(a.size)



    /* Create an array in Kotlin which contains data of all the different data
    types and print the complete array using the Arrays.toString()
     */
    val arr2 : Array<Any> = arrayOf("Kotlin",'a',1,1.4)

    println(Arrays.toString(arr2))



}