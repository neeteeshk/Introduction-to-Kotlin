/*
Given a list = [1, null, 2, 4, null, 6, 8, 10, null].
Insert the number 12 to the number at index 7 and then print out the complete list without any exceptions or null values in the output.
 */
fun main(){

    var myList=mutableListOf(1, null, 2, 4, null, 6, 8, 10, null)
    myList[7]=12;
    print("${myList.filterNotNull()}")
}