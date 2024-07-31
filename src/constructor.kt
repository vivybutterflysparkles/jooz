class Dog(var name:String,var breed:String,var color:String){

}

fun main() {
    var dog1 = Dog("bob","german shepherd","brown")
    println(dog1.name+" "+dog1.breed)

    var dog2 = Dog("boniface","pomeranian","white")
    println(dog2.name+" "+dog2.color)

    var dog3 = Dog("bubbles","husky","black")
    println(dog3.name+" "+dog3.breed+" "+dog3.color)
}
