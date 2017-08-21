package Beginner

fun maxOf(a: Int, b: Int): Int{
    if(a>b){
        return a
    }else if(a<b){
        return b
    }else return a
}
// shorthand method
fun maxOfShort(a: Int, b: Int) = if (a>b) a else b

// type checks and automatic cast
fun getStringLength(obj: Any): Int?{
    if (obj is String){
        return obj.length
    }
    return null
}
fun main(args: Array<String>) {
    println("max of 0 and 42 is ${maxOf(0, 42)}")
    println("max of 2 and 5 is ${maxOfShort(2, 5)}")
    println("Length of string is ${getStringLength(1)}")
    println("Length of string is ${getStringLength("Hello World")}")

//    For loop
    var items = listOf("apples", "oranges", "bananas")
    println(items)
    for (item in items){
        println(item)
    }
    // or
    for (index in items.indices){
        println("$index --> ${items[index]}")
    }
//    When Loop
    fun describe(obj: Any): String =
    when(obj){
        1 -> "One"
        "hello" -> "Greeting"
        is Long -> "Long"
        is Int -> "Int"
        is String -> "String"
        !is String -> "Not String"
        else -> "Unknown"
    }

    println(describe(1))
    println(describe("hello"))
    println(describe("This is me"))
    println(describe(122))
    println(describe(1.2))

// using ranges
    val x = 10
    val y = 9
    if(x in 1..y+1)
        println("$x is in range")
//  for in range
    for(x in 1..5){
        print("$x ")
    }
    // over a progression
    for (x in 1..10 step 2){
        print("$x ")
    }
    for(x in 9 downTo 0 step 3){
        print("$x ")
    }
//    using lambda
    val fruits = listOf("apple", "banana", "avocado", "kiwi")
    fruits
            .filter { it.startsWith("a") }
            .sortedBy{it}
            .map { it.toUpperCase() }
            .forEach{ println(it)}
//    labeling
    loop@ for (i in 1..100) {
        for (j in 1..100) {
            if (i == j) break@loop
        }
    }
}