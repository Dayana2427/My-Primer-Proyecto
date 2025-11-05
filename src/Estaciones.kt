fun main() {
    print("Ingrese el mes: ")
    val index = readln()
    val month = when (index) {
        "Marzo", "Abril", "Mayo" -> {
            "Primavera"
        }
        "Junio", "Julio", "Agosto" -> {
            "Verano"
        }
        "Septiembre", "Octubre", "Noviembre" -> {
            "Otoño"
        }
        "Diciembre", "Enero", "Febrero" -> {
            "Invierno"
        }
        else -> {
            ""
        }
    }
    if (month == ""){
        println("El valor ingresado no es un mes")
    } else {
        println("El mes $index pertenece a la estación $month")
    }
}