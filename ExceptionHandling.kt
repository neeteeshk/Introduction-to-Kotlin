//Types of Exception
// java.lang.ArithmeticException
//Null Pointer Exception  :- when a compiler expects a value but it does not get a value
fun main()
{
    var arr= arrayOf(1,2,3,4)
    try{
        println(arr[4])
    }catch (e: ArrayIndexOutOfBoundsException)
    {

    }finally {
        println(arr[2])
    }


    //Null Pointer Exception

    val nullvalue : String? =null
    println(nullvalue)
    println(nullvalue?.length ?: "this is null")
    /*
    var a : Int? = null
    var b : Int? = null
    var c : Int? =nul
     */

    val nullList = listOf(1,2,3,null,4,null,5,6)
    val nullArray = arrayOf("This",null,"is","a",null,"statement")
    println("the list without null value is ${nullList.filterNotNull()}")
    println("The Array with null value is ${nullArray.filterNotNull()}")

}