open class Animal{
    fun run(){
        println("Just run...")
    }
}

class Tiger: Animal(){
    fun walk(){
        println("Just walk")
    }
}

open class House{
    fun building(){
        println("Just building...")
    }
}

class Bungalow: House(){
    fun bigBuilding(){
        println("Big building...")
    }
}

open class Seed{
    fun soil(){
        println("Just grow...")
    }
}

open class Plant: Seed(){
    fun grow(){
        println("Just growing...")
    }
}

open class Tree: Plant(){
    fun shade(){
        println("Giving shade...")
    }
}

abstract class Car{
    abstract val name: String
    open var speed: Int = 0
}

class BrokenCar(override val name: String): Car(){
    override var speed: Int
        get() = 0
        set(value){
            throw UnsupportedOperationException("Error")
        }
}

abstract class Cycle{
    abstract val name: String
    open var speed: Int =0
}

class HeroCycle(override val name: String): Cycle(){
    override var speed: Int
        get() = 0
        set(value){
            throw UnsupportedOperationException("Error")
        }
}

fun main() {
    val tiger = Tiger()
    tiger.walk()
    tiger.run()

    val bungalow =  Bungalow()
    bungalow.building()
    bungalow.bigBuilding()

    val tree = Tree()
    tree.shade()
    tree.soil()
    tree.grow()

    val car: Car = BrokenCar("Suhas")
    println(car.name)

    val cycle:Cycle = HeroCycle("Herooo")
    println(cycle.speed)

}