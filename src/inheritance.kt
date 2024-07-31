//parent class/super class/base class
open class animal{

    var gender = "male"
    var hasfeathers = true


    fun sound(){
        println("animal is speaking")
    }
}

open class eagle:animal(){
    var hasscales = true
    var isbird = true
}

class ostrich:eagle(){
    fun movement(){
        println("ostrich is walking")
    }
}

fun main() {
    var a = animal()

    var e = eagle()

    var o = ostrich()
}