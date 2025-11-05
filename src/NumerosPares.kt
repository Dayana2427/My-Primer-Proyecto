fun main() {
    val numberList = listOf(23, 35, 678, 45, 98, 499, 354, 234, 586, 567)

    for (number in numberList){
        if (number % 2 == 0){
            println(number)
        }
    }
}
