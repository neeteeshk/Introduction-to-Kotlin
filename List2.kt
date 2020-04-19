/*
Create an immutable list, a mutable list, and an arraylist of the elements:
“Lionel Messi”, “Wayne Rooney”, “Luka Modric”, “Eden Hazard”, “Sergio Aguero”.
 Print all the above three lists.
 */
fun main() {

    // write your code here
    val imList=listOf<String>("Lionel Messi","Wayne Rooney","Luka Modric","Eden Hazard","Sergio Aguero")
    println(imList)

    val mList=mutableListOf<String>("Lionel Messi","Wayne Rooney","Luka Modric","Eden Hazard","Sergio Aguero")
    println(mList)


    val aList=arrayListOf<String>("Lionel Messi","Wayne Rooney","Luka Modric","Eden Hazard","Sergio Aguero")
    println(aList)

}