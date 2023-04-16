fun arrayLearn(){
    //One way of creating array
    val arr1 = arrayOf(1, 2, 3, 4, 5)
    arr1.set(0, -1) //set the first element
    arr1.set(4, 6) //set the fifth element new
    println(arr1.get(4)) //get fifth element
    println(arr1[0]) //get first element

    //Another way of creating array and traversing
    val arr2 = arrayOf<Int>(10, 20, 30, 40, 50)
    for(i in 0..arr2.size - 1){
        println(arr2[i])
    }
    arr2.forEach({item -> println(item)})

    //Another way of creating array
    val arr3 = Array(5, {i -> i-1})
    for ( i in 0..arr3.size-1){
        println(arr3[i])
    }
}