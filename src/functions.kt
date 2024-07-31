fun main() {
    //predefined functions
    println("emobilis")

    var squareroot = Math.sqrt(64.0)
    println("the squareroot is $squareroot")

    var round = Math.round(32.89)
    println(round)

    var myceil = Math.ceil(45.67)
    println(myceil)

    month()
    multiply()
    student(" neema",12)
    student(" vivian",19)
}

//user defined functions
fun month(){
    println("the month is july")

}

fun multiply(){
    var num1 = 20
    var num2 = 5
    println(num1 * num2)
}
//parameter and arguments
fun student(name:String,age:Int){
    println("$name is $age years old")

}