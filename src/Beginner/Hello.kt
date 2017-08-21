package Beginner

//function with a return type
fun sum(a: Int, b: Int): Int{
    return b + a
}
//function without any return type
fun printAB(a: Int, b: Int){
    println(a + b)
}
    // sometimes if there's no return type, Unit is used
fun main(args: Array<String>){
    println("Hello from Kotlin")
    println("Sum of 3 and 4 is ${sum(3, 4)}")
        printAB(6, 11)
}