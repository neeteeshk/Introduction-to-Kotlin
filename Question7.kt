/*
Create a list which contains math function operators (+, -, *, /) as characters.
Iterate through this list and pass two variables along with the list item (operator)
to a function and perform all the math functions on them. Perform the operation corresponding
to the character encountered by the iterator.
Given:
Index of + is 0
Index of - is 1
Index of * is 2
Index of / is 3
In case of division check if the divisor is 0 or not.
 */
fun main() {

    // write your code here
    val op=listOf('+'   ,   '-'   ,  '*'   ,   '/')
    val a=20
    val b=10
    mathFun(a,b,op)

}
fun mathFun(a: Int, b: Int, op: List<Char>)
{
    for (i in 0..op.size-1)
    {
        if(op[i]=='+')
            println(a+b)
        else if(op[i]=='-')
            println(a-b)
        else if(op[i]=='*')
            println(a*b)
        else if(op[i]=='/')
        {
            if(b!=0)
                println(a/b)
            else
                println("not possible to divide by 0")
        }
    }
}