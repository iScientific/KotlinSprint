package org.example

fun main() {
    val nameUser: String = "Ivan"
    var timeOfDay: String = "day"
    var welcome: String = "Good $timeOfDay, $nameUser!"
    println(welcome)
    timeOfDay = "evening"
    welcome = "Good $timeOfDay, $nameUser!"
    println(welcome)
}