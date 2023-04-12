fun main() {
    //If-else
    //Besides the following way, normal curly braces if-else block we can use also
    val maxLimit = -1
    var tempLimit = 1
    val resultLimit = if (maxLimit > tempLimit) maxLimit else if (tempLimit>0) tempLimit else 0
    println("result is $resultLimit")

    //When
    // Which is kinda equivalent to switch case. But we dont need any break statement
    var num: Any = 21
    when (num) {
        is String -> println("You entered string")
        in 1..10 -> println("number is between 10")
        !in 1..10 -> println("number is not between 10")
        else -> println("none of the above")
    }

    //for-loop
    for (i in 1..10){
        println(i)
    }

    for (i in 1 until 10){
        println(i)
    }

    for (i in 10 downTo 1 step 2){
        println(i)
    }

    //while loop
    var number= 30
    while (number < 40){
        println(number)
        number++
    }

    var x = 100
    outer@ while ( x < 105 ){
        x++
        println("outer $x")
        var y = 0
        while ( y < 5){
            if ( y == 0) break@outer
            y++
            println ("inner $y")
        }
    }

    //do-while loop
    var number2 = 40
    do{
        println(number2)
        number2++
    }while (number2 < 50)

    //repeat
    repeat(2){
        println("Testing repeat")
    }

}