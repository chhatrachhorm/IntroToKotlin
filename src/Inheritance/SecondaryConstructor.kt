package Inheritance


//parent class
//open is opposite of final in java
//by default in kotlin, all class are final
open class Log{
    var data: String = ""
    var numberOfData = 0
    constructor(_data: String){
        println("Hello from BaseClass $_data")
    }
    constructor(_data: String, _numberOfData: Int){
        data = _data
        numberOfData = _numberOfData
        println("$data: $numberOfData times")
    }
}

//child class
class AuthLog: Log{
    // secondary constructor for this class with this keyword
    constructor(_data: String): this("From AuthLog ->" + _data, 10){}
    // secondary constructor for the base class with super keyword
    constructor(_data: String, _numberOfData: Int): super(_data, _numberOfData){}
}

fun main(args: Array<String>) {
    AuthLog("Log in")
    AuthLog("Sign in", 20)

//    Output
//    From AuthLog ->Log in: 10 times
//    Sign in: 20 times
}