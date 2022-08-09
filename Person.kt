open class Person (var name:String, var age:Int ) {
    init {
        println("Name: $name")
        println("Age: $age")
    }
    fun learn(){
        println("$name learn")
    }
    fun walk(){
        println("$name walk")
    }
    fun eat(){
        println("$name eat")
    }
}