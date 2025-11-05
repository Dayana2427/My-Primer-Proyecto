fun main() {
    print("¿El clima es bueno? V o F: ")
    val isGoodWeather = readln().toBoolean()
    print("¿Qué hora es?: ")
    val time = readln().toInt()
    val isDay = time in 7..<18
    val isNight = time !in 7..<22
    if (!isNight && isGoodWeather){
        println("Sal a caminar")
    } else if (!isNight && !isGoodWeather){
        println("Lee un libro")
    } else {
        println("Ve a dormir")
    }
}