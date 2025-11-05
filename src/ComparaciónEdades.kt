fun main() {
    print("Ingrese su edad 1: ")
    val firstAge = readln().toInt()
    print("Ingrese su edad 2: ")
    val secondAge = readln().toInt()
    if (firstAge > secondAge){
        print("Persona 1 es mayor que persona 2")
    } else if (firstAge < secondAge){
        print("Persona 1 es menor que persona 2")
    }else {
        print("Persona 1 y persona 2 tiene la misma edad")
    }
}