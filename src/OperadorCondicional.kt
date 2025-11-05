fun main() {
    val temperatura = readln().toInt()
    val hot = temperatura > 25
    val cold = temperatura < 20
    if (hot){
        println("El A.A esta encendido")
    } else if(cold){
        println("El A.A esta apagado")
    } else{
        println("El A.A no esta haciendo nada")
    }
}