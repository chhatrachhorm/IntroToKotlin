package Inheritance

class Lamp{
    private var isOn= false
    fun turnOn(){
        isOn = true
    }
    fun turnOff(){
        isOn = false
    }
    fun displayLightStatus(lamp: String) {
        if (isOn == true)
            println("$lamp lamp is on.")
        else
            println("$lamp lamp is off.")
    }

}

fun main(args: Array<String>) {
    val l1 = Lamp()
    val l2 = Lamp()
    l1.turnOff()
    l2.turnOn()
    l1.displayLightStatus("l1")
    l2.displayLightStatus("l2")

}

