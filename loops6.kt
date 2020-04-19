//Print all the values of the array arr = [1, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20] in a new line.
fun main() {

    // write your code here
    var arr : Array<Int> = arrayOf(1, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20)
    for (i in 0..arr.size-1)
    {
        println(arr[i])
    }

}