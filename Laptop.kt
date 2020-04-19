//Create a class ‘Laptop’ with properties as RAM, brand and hard disk size. Also, create a function ‘performComputations’ in it.
class Laptop {
    var ram : String = "8 GB"
    var brand : String = "apple"
    var hdd : String = "2 TB"
    fun performComputations()
    {
        println("I am a laptop of ${brand} with ${ram} ram and ${hdd} hdd")
        println("I am here to perform computation")
    }
}
fun main(){

    // Create object of class here
    val laptop=Laptop()
    println(laptop.ram)
    println(laptop.brand)
    println(laptop.hdd)
    laptop.performComputations()

}