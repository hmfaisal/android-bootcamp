class ConstructorClass : ParentTest {

    // calling another secondary using this
    constructor(a:Int, b:Int) : this(a, b, 9){
        var result = a + b
        println("Sum of two $result")
    }

    // this executes third
    // This will call Parent class constructor
    constructor(a:Int, b:Int, c:Int):super(a,b,c){
        var result = a + b + c
        println("Sum of three $result")
    }

    // this executes second
    init{
        println("This is first init block")
    }
}

open class ParentTest{
    // this executes first
    constructor(a:Int, b:Int, c:Int, d:Int = 10){
        var result = a + b + c+ d
        println("Sum of four is $result")
    }
}