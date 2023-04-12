fun main() {
    /*
    We can assign the type like this
    val myMaxByteValue: Byte = Byte.MAX_VALUE
    But without assigning also work as its automatically infer
     */

    //Byte
    val myMaxByteValue = Byte.MAX_VALUE
    val myMinByteValue = Byte.MIN_VALUE
    println("Byte maximum value is: $myMaxByteValue")
    println("Byte minimum value is: $myMinByteValue")

    //Short
    val myMaxShortValue = Short.MAX_VALUE
    val myMinShortValue = Short.MIN_VALUE
    println("Short maximum value is: $myMaxShortValue")
    println("Short minimum value is: $myMinShortValue")

    //Integer
    val myMaxIntValue = Int.MAX_VALUE
    val myMinIntValue = Int.MIN_VALUE
    println("Int maximum value is: $myMaxIntValue")
    println("Int minimum value is: $myMinIntValue")

    //Long
    val myMaxLongValue = Long.MAX_VALUE
    val myMinLongValue = Long.MIN_VALUE
    println("Long maximum value is: $myMaxLongValue")
    println("Long minimum value is: $myMinLongValue")

    //Float / Double
    val myFloatNumber = 2F
    val myDoubleNumber = 2.0 // Automatically intefer to double
    println("Float value is: $myFloatNumber")
    println("Double value is: $myDoubleNumber")

    //Char / String
    val myCharValue: Char = 'C'
    val myStringValue = "Alex"
    println("my char value is $myCharValue")
    println("my string value is $myStringValue")

    //Boolean
    val myBoolValue = false
    println("my bool value is $myBoolValue")

    //Val vs Var
    var numberFish = 5 //changeable
    val numberBoats = 2 //unchangeable
    numberFish = 8

    println("I have $numberBoats boats and $numberFish fishes")



}