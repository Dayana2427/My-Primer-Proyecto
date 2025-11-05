fun main() {
    val numbers = 0..1000
    print("Ingrese el número: ")
    val number = readln().toInt()
    val result = number in numbers
    println(result)
}