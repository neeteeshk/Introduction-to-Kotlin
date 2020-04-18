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

    val newArr : Array<Any>=arrayOf("Hello",100,20.5,'a',true)


    // MORE ABOUT ARRAY
    var stringArray : Array<String> = arrayOf("Hello","Kotlin","Programmers")
}