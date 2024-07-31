import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)

    println("enter year of study : ")
    var year = read.nextInt()

    var output = when(year){
        1 -> "first year"
        2 -> "second year"
        3 -> "third year"
        4 -> "forth year"
        else -> "invalid year"
    }
    println("i am a $output student")

}