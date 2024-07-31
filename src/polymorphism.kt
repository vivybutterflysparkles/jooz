open class shape{
    open fun draw(){
        println("drawing a shape")
    }
}

class rhombus:shape(){
    override fun draw(){
        println("drawing a rhombus")
    }
}

class parallelogram:shape(){
    override fun draw(){
        println("drawing a parallelogram")
    }
}

fun main() {
    var myshape = shape()
    var myrhombus = rhombus()
    myrhombus.draw()
    var myparalleologram = parallelogram()
    myparalleologram.draw()
}