fun main() {
    val daysOfMonth = listOf(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
    print("Ingrese el índice del mes que quiere ver: ")
    val mes = readln().toInt()

    if (mes > 1 && mes < 12){
        println("Error: solo hay doce meses")
    }else {
        println(daysOfMonth[mes - 1])
    }
}