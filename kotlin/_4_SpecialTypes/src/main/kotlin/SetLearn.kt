fun setLearn(){
    //Immutable Set
    val fruits = setOf("apple", "orange", "banana", "apple")
    for(fruit in fruits){
        println(fruit)
    }
    //Filter the list and create a new list
    val filteredFruits = fruits.filter { it.startsWith("a") }
    println("Filtered fruits $filteredFruits")

    //Mutable Set
    var mutableSet = mutableSetOf<Int>(1, 5, 9, 2)
    mutableSet.add(-1)
    mutableSet.add(2)
    for (item in mutableSet){
        println(item)
    }
}