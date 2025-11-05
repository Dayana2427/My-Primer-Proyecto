/*fun main() {
    print("Ingrese su edad: ")
    var age = readln().toInt()

    repeat(18 - age){
            println("Espera un año más")
    }
    println("Puede ingresar a esta función")

}*/


fun main() {
    print("Ingresesu edad: ")
    var age = readln().toInt()

    while (age < 18){
        println("Espera otro año")
        age++
    }
    println("El usuario puede ir al cine")
}