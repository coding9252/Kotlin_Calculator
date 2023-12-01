package com.leegahyeon.kotlin_calculator

fun main() {
    var num1 = readLine()!!.toDouble()


    while (true) {
        val operator = readLine()!!.toString()
        val num2 = readLine()!!.toDouble()

        when (operator) {
            "+" -> {
                num1 = num1 + num2
                println("${num1}")
            }

            "-" -> {
                num1 = num1 - num2
                println("${num1}")
            }

            "*" -> {
                num1 = num1 * num2
                println("${num1}")
            }

            "/" -> {
                num1 = num1 / num2
                println("${num1}")
            }

            "%" -> {
                num1 = num1 % num2
                println("${num1}")
            }

            else -> println("잘못 입력하셨습니다.")
        }
    }
}
