import java.util.Scanner

fun main() {

    for (number in 20..25) {
        println("number : $number")
    }

    for (letter in 'a'..'f') {
        println("letter is $letter")
    }

    for (num in 100..104) {
        if (num == 103) {
            break
        }
        println(num)
    }

    for (myletter in 'a'..'d') {
        if (myletter == 'b') {
            continue
        }
        println(myletter)
    }
}