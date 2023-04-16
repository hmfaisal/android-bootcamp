fun mapLearn(){
    //Immutable Map
    val fruits = mapOf(1 to "apple", 2 to "orange", 3 to "banana", 4 to "apple")
    for(key in fruits.keys){
        println(fruits[key])
    }
    //Access element in the list
    println("First fruit ${fruits[1]}")

    //Mutable Map
    var mutableMap = mutableMapOf<Int,String>(1 to "Mahipal",2 to "Nikhil",3 to "Rahul")
    mutableMap.put(1,"Praveen")
    mutableMap.put(4,"Abhi")
    for(item in mutableMap.values){
        println(item)
    }
}