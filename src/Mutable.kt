fun main() {
    print("Ingrese la temperatura: ")
    var temperature = readln().toInt()
    var airConditionerIsOn = false

    repeat(times = 100) {
        if (temperature > 25) {
            airConditionerIsOn = true
        } else if (temperature < 20) {
            airConditionerIsOn = false
        }
        if (airConditionerIsOn) {
            temperature -= 1
        } else {
            temperature += 1
        }
        println("Temperatura actual: $temperature")
    }
}