package com.leegahyeon.kotlin_calculator

fun main () {
    val num1 = readLine()!!.toDouble()
    val operator = readLine()!!.toString()
    val num2 = readLine()!!.toDouble()

    val plus = num1 + num2
    val minus = num1 - num2
    val multiply = num1 * num2
    val devide = num1 / num2
    val remain = num1 % num2

    when(operator) {
        "+" -> println("${plus}")
        "-" -> println("${minus}")
        "*" -> println("${multiply}")
        "/" -> println("${devide}")
        "%" -> println("${remain}")
        else -> println("잘못 입력하였습니다.")
    }

}
