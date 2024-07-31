// A = L * W

import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)

    println("enter length : ")
    var l = read.nextInt()

    println("enter width : ")
    var w = read.nextInt()

    println("area is : ")
    var area = l * w
    println(area)
}