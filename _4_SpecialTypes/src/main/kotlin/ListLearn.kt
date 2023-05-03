fun listLearn(){
    //Immutable List
    val fruits = listOf("apple", "orange", "banana", "apple")
    for(fruit in fruits){
        println(fruit)
    }
    //Access element in the list
    println("First fruit ${fruits[0]}")
    println("Last fruit ${fruits.last()}")
    //Filter the list and create a new list
    val filteredFruits = fruits.filter { it.startsWith("a") }
    println("Filtered fruits $filteredFruits")

    //Mutable List
    var mutableList = mutableListOf(1, 5, 9, 2)
    mutableList[0] = -1
    mutableList.add(2)
    for (item in mutableList){
        println(item)
    }
}