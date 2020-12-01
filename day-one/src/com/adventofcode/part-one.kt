package com.adventofcode

fun main() {
    val inputData = FileReader().parseFile("day-one-input.csv").map { it.toInt() }

    inputData.forEachIndexed {index: Int, number1: Int ->

        for (i in inputData.indices) {
            val number2 = inputData[i]
            if (index != i) {
                val total = number1 + number2
                if (total == 2020) {
                    println(number1 * number2)
                }
            }
        }
    }
}