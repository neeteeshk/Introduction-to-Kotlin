fun main()
{
    // Immutable list
    // var/val listName=listOf<datatype>(list of items)
    val listOfString= listOf<String>("box","apple","cat")
    println(listOfString)



    //MutableList
    //var/val listName=mutableListOf<datatype>(list of items)

    val listOfString1= mutableListOf<String>("box","apple","cat")
    listOfString1[1]="car"
    listOfString1.add("cup")
    listOfString1.add(2,"bat")
    listOfString1.removeAt(0)
    val arr = arrayOf("van","bus","truck","jeep")
    listOfString1.addAll(arr)
    println(listOfString1)




    //ArrayList

    val A= arrayListOf<String>("ram","shayam")

}