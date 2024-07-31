fun main() {

    var courses = arrayOf("mit","android","datascience")
    println(courses[1])

    //reassigning an element in an array
    courses[1] =  "web development"
    println(courses[1])

    //looping through an array
    var newcourse = courses.plus("cybersecurity")
    for (course in newcourse){
        println(course)
    }

    //size of an array
    println(newcourse.size)
    println(courses.size)
}