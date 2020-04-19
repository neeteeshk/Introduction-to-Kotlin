fun main()
{
    for (i in 1..10)
    {
        println(i)
    }
    var i=1
    while(i<=10)
    {
        println(i)
        i++
    }
    i=1
    do{
        println(i)
        i++
    }while (i<=10)

    val arr : Array<Char> =arrayOf('a','b','c','d','e')
    for (i in 0..arr.size-1)
    {
        println(arr[i])
    }
    for(i in 0 until arr.size)
    {
        println(arr[i])
    }
}