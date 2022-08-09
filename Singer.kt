class Singer  (name: String, age: Int, bandName: String) : Person(name, age) {

    fun singing(){
        println("$name singing")
    }
    fun playGitar(){
        println("$name playGitar")
    }
}