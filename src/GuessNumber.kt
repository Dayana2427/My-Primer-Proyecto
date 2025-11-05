import kotlin.random.Random

fun main() {
    //val correctNumber = 37
    val correctNumber = Random.nextInt(100)
    var win = false

    while (!win){
        print("Ingrese un número del 0 al 100: ")
        val number = readln().toInt()
        if (number < correctNumber){
            println("Tu número es menor")
        }else if (number > correctNumber){
            println("Tu número es mayor")
        } else {
            win = true
            println("Your number is correcto!!")
        }
    }
}