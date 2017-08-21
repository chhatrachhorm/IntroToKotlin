package Beginner

fun main(args: Array<String>){
//    basic ways to declare local var
    var a: Int = 1 // immediate assignment
    var b = 2 // `Int` type is inferred
    var c: Int // a type is required when there's no initialization
    c = 3 // defered assignment
    println("a = $a, b = $b, c = $c")
    var x = 0
    x += 1
    println(x)
//    String templates
    // simple name in templates
    val s1 = "a is $a"

    a = 2
    // arbitrary expression in template:
    val s2 = "${s1.replace("is", "was")}, but now is $a"
    print(s2)
}