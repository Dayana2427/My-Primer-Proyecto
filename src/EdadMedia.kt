fun main() {
    print("Edad de Juan: ")
    val juan = readln().toFloat()
    print("Edad de Maria:")
    val maria = readln().toFloat()
    print("Edad de Lucas: ")
    val lucas = readln().toFloat()
    val edadPromedio = (juan + maria +lucas) / 3
    print(edadPromedio)
}