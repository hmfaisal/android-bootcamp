fun nestedClassLearn(){
    val myCar = NestedClass()
    myCar.make = "VW"
    myCar.model = "Passat"
    myCar.year = 2022
    val engine = myCar.Engine()
    engine.hp = 220
    engine.cyl = 6
    println(engine.getEngineInfo())
    println(myCar.getInfo())
}