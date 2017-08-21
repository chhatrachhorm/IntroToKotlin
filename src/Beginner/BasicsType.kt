package Beginner

fun main(args: Array<String>) {
//    use underscore to make the number more readable
    // Int
    val oneMillion = 1_000_000
    // Long
    val creaditCardNum = 1234_56789_9012_34567L
    // HexBytes or Hex start with 0x
    val hexBytes =0xFF_EC_DE_5
    // bytes - start with 0b
    val bytes = 0b11010101
//    boxing
    val a = 1000
    print(a===a)
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a
    print("\n${boxedA == anotherBoxedA}")
// to convert
    val k: Byte = 1
//    val i: Int = b - error
    val i: Int = k.toInt() // explicit conversion
    println(i.toByte())

//    operation
    val o = (1 shl 2) and 0x000FF12E
    println(o)
//    array
    var arrayType = arrayOf(1, 2, 3)
    println(arrayType)
    for ((index, value) in arrayType.withIndex()){
        println("$index -> $value")
    }
    var ascs = Array(5, {i -> (i * i).toString()})
    for( asc in ascs){
        print("$asc ")
    }
    val xs: IntArray = intArrayOf(1, 2, 3, 56)
    for (i in xs.indices)
        print("\n$i -> ${xs[i]}")
//   String
    val s = "\nHello from Kotlin"
    val text = """
        for (c in "foo")
            print(c)

        """
    println("$s, I can do like : $text\n")
    val trimText = """
        |Tell me and I forgot
        |Tech me and I remember
        |Involve me and I learn
        """.trimMargin()
    println("$trimText")
//    by default, | is used as margin prefixed, to use another thin
//    try ">" as the parameter pass to trimMargin(">")
    val customTrimText= """
        >Custom
        >Text
        >Margin
        """.trimMargin(">")
    println(customTrimText)

}