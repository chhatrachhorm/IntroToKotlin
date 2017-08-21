package Inheritance

class Fruit{


    var name: String = "DefaultValue"
//    getter, field is the keyword
    get() = field
//    setter
    set(value) {
        field = value.toUpperCase()
    }



    var fname: String = "Default"
        get() = field
//    setter
        set(value) {
            field = value.toLowerCase()
        }
//When you instantiate object of the Person class
// and initialize the name property,
// it is passed to the setters parameter value and sets field to value

}

fun main(args: Array<String>) {
    val f = Fruit()
    f.name = "apples"
    print("${f.name}")
    f.fname = "PLAE PORM"
    print("\n${f.fname}")
}