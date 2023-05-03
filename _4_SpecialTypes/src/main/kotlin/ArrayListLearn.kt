fun arrayListLearn(){
    // creating empty arraylist using constructor
    var arraylist = ArrayList<String>()
    //adding String elements in the list
    arraylist.add("Items")

    arraylist.add("Buckets")
    // iterating the list
    println("Array list ---->")
    for(i in arraylist)
        println(i)

    arraylist.add( 1 , "For")
    println("Arraylist after insertion ---->")
    for(i in arraylist)
        println(i)
}