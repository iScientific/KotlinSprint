package org.example.Lesson_1

fun main() {
    val year: Short = 1961
    var hour: Byte = 9
    var minute: Byte = 7
    val timeTakeof = String.format("%02d:%02d", hour, minute)
    println("Время взлета")
    println(year)
    println(timeTakeof)

    hour = 10
    minute = 55
    println("Время посадки")
    println(String.format("%02d:%02d", hour, minute))

}