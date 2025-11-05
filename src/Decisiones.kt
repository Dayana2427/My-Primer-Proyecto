fun main() {
    print("¿Cuánto dinero hay?: ")
    val dinero = readln().toInt()
    print("¿Tiene hambre?: ")
    val tieneHambre = readln().toBoolean()
    if (dinero > 500 && tieneHambre){
        println("Compra pizza")
    } else if (dinero <= 500 && tieneHambre){
        println("Compra fideos")
    } else if (dinero > 500 && !tieneHambre){
        println("Ve al cine")
    }else {
        println("Ve a caminar")
    }
}