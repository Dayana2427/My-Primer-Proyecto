fun main() {
   //val numbers = 0..1000
    val numbers = 0 until 1_000 step 10
    for (number in numbers){
        println(number)
    }
}