fun main() {
    val daysOfWeekAsSrting = "Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday"
    val daysOfWeek = daysOfWeekAsSrting.split(", ")
    for (day in daysOfWeek){
        println(day)
    }
}