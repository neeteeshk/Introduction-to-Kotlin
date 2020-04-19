
class Dog {
    var breed : String = "Labrador"
    var color : String = "Brown"
    var age : Int = 3
    fun eat()
    {
        println("${breed}s eat food")
    }
    fun bark()
    {
        println("${breed}s bark")
    }

}
fun main()
{
    val dog1=Dog()
    dog1.breed="German Shepherd"
    dog1.color="Black"
    dog1.age=3
    dog1.eat()
    dog1.bark()
}