import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)

    println("input the temperature of your patient :")
    var temperature = read.nextDouble()

    if (temperature > 37){
        println("high fever")
    }
    else if (temperature < 37){
        println("low fever")
    }
    else{
        println("normal temperature")
    }

}