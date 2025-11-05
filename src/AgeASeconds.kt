fun main() {
    print("Ingrese su edad: ")
    val age = readln().toInt()
    val result = 365L * 24 * 60 * 60 * age
    println(result)
    }