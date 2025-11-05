fun main() {
    print("Ingrese una contraseña: ")
    val password = readln().toCharArray()
    var containLetter = false
    var containNumber = false
    var containSymbol = false
    for (symbol in password) {
        if (symbol.isLetter()) containLetter = true

        if (symbol.isDigit()){
            containNumber = true
        }
        if (!symbol.isLetterOrDigit()){
            containSymbol = true
        }
    }
    if (containLetter && containNumber && containSymbol && password.size >= 8) {
        println("Contraseña valida")
    } else {
        println("Contraseña my simple")
    }
}