package Inheritance

//primary constructor
class Person(val firstName: String, var age: Int){
    val fName: String
    val by: Int

    // initializer block
    init {
        fName = firstName.capitalize()
        by = 2017-age

        println("First Name = $fName ")
        println("Birth Year is $by")
    }

}

fun main(args: Array<String>) {
    val person1 = Person("Jack", 29)
    println("Person name is ${person1.firstName}" +
            "and the age is ${person1.age}")
}