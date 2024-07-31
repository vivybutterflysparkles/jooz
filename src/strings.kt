fun main() {
    var firstname = "Vivian"
    var lastname = "Opindi"

    println(firstname)

    //accessing a character in a string
    println(firstname[3])

    //modifying a string
    println(firstname.uppercase())
    println(lastname.lowercase())

    //string concatenation - joining strings
    println(firstname + lastname)
    println(firstname.plus(lastname))
    println(firstname+" "+lastname)

    //string interpolation
    println("my firstname is "+firstname)
    println("my lastname is $lastname")

    var num1 = 34
    var num2 = 20

    println("the sum of $num1 and $num2 is ${num1+num2}")
    println("the sum of $num2 and $num1 is "+ (num1 + num2))

}