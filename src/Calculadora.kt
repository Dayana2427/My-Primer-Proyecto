fun main() {
    print("Introdcuzca el primer número: ")
    val num1 = readln().toDouble()
    print("Ingrese el simbolo +,-,*,/: ")
    val signo = readln()
    print("Ingrese el segundo número: ")
    val num2 = readln().toDouble()

    var result = 0.0
    if (signo == "+"){
        result = num1 + num2
    } else if (signo == "-"){
        result = num1 - num2
    }else if (signo == "*"){
        result = num1 * num2
    }else if (signo == "/"){
        result = num1 / num2
    }
    println("$num1 $signo $num2 = $result")
}