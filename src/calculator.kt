import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)

    println("1. Add")
    println("2. Subtract")
    println("3. Multiply")
    println("4. Divide")

    println("Enter your choice (1/2/3/4): ")
    var operator = read.nextInt()

    println("enter first number :")
    var num1 = read.nextInt()
    println(num1)

    println("enter second number :")
    var num2 = read.nextInt()
    println(num2)

    var output = when(operator){
        1 -> num1 + num2
        2 -> num1 - num2
        3 -> num1 * num2
        4 -> num1 / num2
        else -> "invalid operator"
    }
    println("answer is $output")

}