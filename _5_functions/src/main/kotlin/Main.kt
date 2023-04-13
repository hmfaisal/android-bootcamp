fun namedArgument(firstName:String, lastName:String = "Cooper"){
    println("The name of student is $firstName $lastName")
}

fun main(args: Array<String>) {
    namedArgument(lastName = "Maximillan", firstName = "Alen")
}