fun main() {
    val seconds = readln().toInt() // lee un entero: total de segundos
    val hours = seconds / 3600 // división entera -> cuántas horas completas hay
    val secondsForMinutes = seconds % 3600 // resto después de sacar las horas (segundos sobrantes)
    val minutes = secondsForMinutes / 60 //división entera -> cuántos minutos completos del resto
    val leftSeconds = secondsForMinutes % 60  //resto -> los segundos que quedan después de sacar minutos
    print("$hours : $minutes : $leftSeconds")
}