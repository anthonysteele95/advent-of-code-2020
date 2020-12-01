package com.adventofcode

fun main() {
    val inputData = FileReader().parseFile("day-one-input.csv").map { it.toInt() }

    inputData.forEachIndexed {index, number1 ->
        for (i in inputData.indices) {
            if (index != i) {
                val number2 = inputData[i]
                val sum = number1 + number2
                if (sum < 2020) {
                    val remainingElement = inputData.filter { it != number1 || it != number2 }
                    remainingElement.forEach {
                        if (it + sum == 2020) {
                            println(it * number1 * number2)
                        }
                    }
                }
            }
        }
    }
}