class NestedClass {
    var make: String = ""
        //Custom Getter
        get() {
            return field.lowercase()
        }
    var model: String = ""
        get(){
            return field.lowercase()
        }
    var year: Int = 0
        // Custom Setter
        set(value) {
            field = if(value > 2000 ) value else throw IllegalArgumentException("Car year must be greater than 2000")
        }

    inner class Engine(){
        var hp: Int = 0
        var cyl: Int = 0

        fun getEngineInfo(): String{
            return "$make $model has engine horsepower $hp and cylinder $cyl"
        }
    }

    fun getInfo(): String {
        return "$make $model car built at $year"
    }
}