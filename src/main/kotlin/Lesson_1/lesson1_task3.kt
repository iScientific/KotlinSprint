package org.example.Lesson_1

fun main() {
    val year: String = "1961"
    var hour: String = "09"
    var minute: String = "07"

    println("Время взлета")
    println(year)
    println(hour)
    println(minute)

    hour = "10"
    minute = "55"

    println("Время посадки")
    println(hour + ":" + minute)

}