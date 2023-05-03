interface Dimensions {
    val length : Double
    val breadth : Double
}

interface CalculateParameters : Dimensions {
    fun area()
    fun perimeter()
}

interface InterfaceMethods {
    fun description()
}

class InterfaceClass: CalculateParameters, InterfaceMethods {
    override val length : Double
        get() = 10.0
    override val breadth : Double
        get()= 15.0

    override fun area()
    {
        println("Area is ${length * breadth}")
    }

    override fun perimeter()
    {
        println("Perimeter is ${2*(length+breadth)}")
    }

    override fun description(){
        println("Multiple Interfaces implemented")
    }
}