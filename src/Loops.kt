fun main() {
    val names = listOf("John", "Mike", "Nick", "Helen", "Alex", "Emma", "Mark")
    print("Ingrese el nombre : ")
    val searchName = readln()
    var nameFound = false

    /*var index = 0
    while (index < names.size){
        val name = names[index]
        println(name)
        if (searchName == name){
            nameFound = true
            break
        }
        index++
    }*/

    for (name in names){
        println(name)
        if (searchName == name){
            nameFound = true
            break
        }
    }
    println("Nombre encontrado: $nameFound")
}