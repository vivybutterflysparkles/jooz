import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)

    println("first number :")
    var first = read.nextInt()
    println(first)

    println("second number :")
    var second = read.nextInt()
    println(second)

    if (first < second ){
    println("$first is the smallest number")
    }

    else if (second < first){
    println("$second is the smallest number")
    }

    else {
    println("numbers are equal")
    }
}