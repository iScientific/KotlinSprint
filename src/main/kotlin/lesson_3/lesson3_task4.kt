package org.example.lesson_3

fun main() {
    var stepOut: String = "E2"
    var stepIn: String = "E4"
    var namStep: Byte = 1
    var sendMess: String = "$stepOut-$stepIn:$namStep"
    println(sendMess)

    stepOut = "D2"
    stepIn = "D3"
    println("$stepOut-$stepIn:${++namStep}")
}