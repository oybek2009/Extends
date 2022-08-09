class Dancer(name: String, age: Int, groupName: String) : Person(name, age) {

    fun dancing(){
        println("$name dancing")
    }
}