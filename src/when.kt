import java.util.Scanner

fun main() {
    var marks = 70

    var grade = when(marks){
        80 -> 'A'
        70 -> 'B'
        60 -> 'C'
        50 -> 'D'
        else -> 'E'
    }
    println("student scored $grade")
}