import kotlin.math.sin

fun main() {
    val person = Person("Ali",20)
    person.learn()
    person.walk()
    person.eat()
    println("-------------")
    val programmer = Programmer("Tom",21,"IT School")
    programmer.learn()
    programmer.walk()
    programmer.eat()
    programmer.coding()
    println("-------------")
    val dancer = Dancer("Mayk",23,"All Stars")
    dancer.learn()
    dancer.walk()
    dancer.eat()
    dancer.dancing()
    println("-------------")
    val singer = Singer("Tome",22,"Minor Prophets")
    singer.learn()
    singer.walk()
    singer.eat()
    singer.singing()
    singer.playGitar()

}