package Inheritance

// println(a+b) i.e. println(a.plus(b))

class Point(var x: Int = 0, var y: Int = 0){
    // overloading plus function or overriding plus function for user-defined object
    operator fun plus(p: Point) : Point {
        return Point(x + p.x, y + p.y)
    }
    operator fun dec() = Point(--x, --y)
//    i.e.
//    operator fun dec(): Point{
//    return Point(--x, --y)}
}

fun main(args: Array<String>) {
    val p1 = Point(3, -8)
    val p2 = Point(2, 9)
    var sum = p1 + p2
    println(sum)
    println("Sum = (${sum.x}, ${sum.y})")
    var p3 = Point(5, 9)
    --p3 // i.e. dec(p3)
    println("p3(${p3.x}, ${p3.y})")

//   Here, the plus() function is marked with operator keyword to tell compiler
//   that + operator is being overloaded.
//   The expression p1 + p2 is transformed to p1.plus(p2) under the hood.


}