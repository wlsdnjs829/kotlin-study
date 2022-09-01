package com.example.kotlin.kotlin_in_action_6

import java.io.BufferedReader
import java.io.StringReader

fun main() {
    val readNumbers = readNumbers(BufferedReader(StringReader("1\nabc\n42")))
    addValidNumbers(readNumbers)
}

fun readNumbers(reader: BufferedReader): List<Int?> {
    val result = ArrayList<Int?>()

    for (line in reader.lineSequence()) {
        try {
            val number = line.toInt()
            result.add(number)
        } catch (e: NumberFormatException) {
            result.add(null)
        }
    }

    return result
}

fun addValidNumbers(numbers: List<Int?>) {
    val validNumbers = numbers.filterNotNull()

    println("유효한 숫자 : ${validNumbers.sum()}")
    println("유효하지 않은 숫자 : ${numbers.size - validNumbers.size}")
}