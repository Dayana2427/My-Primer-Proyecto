fun main() {
    print("Ingrese el indice del mes: ")
    val index = readln().toInt()
    /*val month = when (index) {
        1 -> "enero"
        2 -> "febrero"
        3 -> "marzo"
        4 -> "abril"
        5 -> "mayo"
        6 -> "junio"
        7 -> "julio"
        8 -> "agosto"
        9 -> "septiembre"
        10 -> "octubre"
        11 -> "noviembre"
        12 -> "diciembre"
        else -> ""
    }*/

    val month = if (index == 1){
        "enero"
    } else if (index == 2) {
        "febrero"
    } else if (index == 3) {
        "marzo"
    }
    else if (index == 4) {
        "abril"
    }
    else if (index == 5) {
        "mayo"
    }
    else if (index == 6) {
        "junio"
    }
    else if (index == 7) {
        "julio"
    }
    else if (index == 8) {
        "agosto"
    }
    else if (index == 9) {
        "septiembre"
    }
    else if (index == 10) {
        "octubre"
    }
    else if (index == 11) {
        "noviembre"
    }
    else if (index == 12) {
        "diciembre"
    } else {
        ""
    }

    if (index in 1..12){
        println("El índice $index corresponde al mes $month")
    } else {
        println("Tú entrada no corresponde a ningun mes")
    }
}