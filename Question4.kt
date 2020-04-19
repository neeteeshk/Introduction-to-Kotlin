//Print the even and odd numbers from 1 to 100 using the ‘while’ and ‘do-while’ loop
fun main()
{
    var i=1
    println("odd numbers using while loop")
    while(i<100)
    {
        print("$i  ")
        i+=2
    }

    i=2
    println("\neven numbers using while loop")
    while(i<100)
    {
        print("$i  ")
        i+=2
    }


    i=1
    println("\nodd numbers using do while loop")
    do{
        print("$i  ")
        i+=2
    }while(i<100)


    i=2
    println("\nodd numbers using do while loop")
    do{
        print("$i  ")
        i+=2
    }while(i<100)
}