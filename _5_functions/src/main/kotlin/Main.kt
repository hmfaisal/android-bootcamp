fun namedArgument(firstName:String, lastName:String = "Cooper"){
    println("The name of student is $firstName $lastName")
}

fun recursiveSum(args:Array<Int>, index:Int):Int{
    return if(index <=0 ) 0
    else(recursiveSum(args, index-1) + args[index-1])
}

fun tailRecursiveSum(args:Array<Int>, index:Int, res:Int =0):Int{
    return if(index <=0 ) res
    else(tailRecursiveSum(args, index-1, res) + args[index-1])
}

//lambda function
val sum = { a:Int, b:Int -> a+b }

//higher order function
fun highOrderFunc( lmbd: ( Int, Int ) -> Int){
    var res = lmbd(2, 4)
    println("The sum of 2 number by higher order is $res")
}
// regular function definition
fun printMe(s:String): Unit{
    println(s)
}
// higher-order function definition
//represents that it accept function as a parameter which returns Unit = Void.
fun higherfunc( str : String, myfunc: (String) -> Unit){
    // invoke regular function using local name
    myfunc(str)
}

fun main(args: Array<String>) {
    //Named Argument
    namedArgument(lastName = "Maximillan", firstName = "Alen")

    //Recursive Function
    val arr1 = arrayOf(1, 2, 4, 6, 8)
    val result1 = recursiveSum(arr1, arr1.size)
    println ("The sum of array element is $result1")

    //Tail recursion
    //In tail recursion, function call is the last thing executed by the function and nothing left in the current function to execute.
    val arr2 = arrayOf(1, 2, 4, 6, 8)
    val result2 = tailRecursiveSum(arr2, arr2.size)
    println ("The sum of array element is by tail recursion $result2")

    //lambda function
    // val sum2:(Int,Int)-> Int  = { a , b -> a + b}
    val resultLambda = sum(2,3)
    println("The sum of two numbers by lambda function is: $resultLambda")

    //higher order function
    highOrderFunc(sum)// passing lambda as parameter
    higherfunc("I am going to be printed",::printMe)
}