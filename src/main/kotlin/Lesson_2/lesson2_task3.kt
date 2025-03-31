package org.example.Lesson_2

fun main() {
    val hourDepart: Byte = 9
    val minuteDepart: Byte = 39
    val timeTravel: Int = 457
    val startDepart: Int = hourDepart * 60 + minuteDepart
    val fullTime: Int = startDepart + timeTravel

    val hoursTimeTravel: Int = fullTime / 60
    val minuteTimeTravel: Int = fullTime - hoursTimeTravel * 60

    println(hoursTimeTravel)
    println(minuteTimeTravel)
}