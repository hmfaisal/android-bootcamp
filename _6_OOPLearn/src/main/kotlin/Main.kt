fun main(args: Array<String>) {
    //Test Nested Class
    //nestedClassLearn()

    //Test Constructor
    //constructorLearn()

    //Test interface and inheritence
    //interfaceLearn()

    //Data class
    data class man(val name: String, val age: Int)
    {
        var height: Int = 0;
    }
    val man1 = man("manish",18)
    val man2 = man1.copy(name="rahul") //copying details of man1 with change in name of man
    man1.height=100
    man2.height=90
    println("${man1} has ${man1.height} cm height")
    println("${man2} has ${man2.height} cm height")

}