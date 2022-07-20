package com.example.kotlin.kotlin_in_action_2

import com.example.kotlin.kotlin_in_action_2.Color.GREEN
import com.example.kotlin.kotlin_in_action_2.Color.ORANGE
import com.example.kotlin.kotlin_in_action_2.Color.RED
import com.example.kotlin.kotlin_in_action_2.Color.YELLOW
import java.io.BufferedReader
import java.io.StringReader
import java.util.Objects
import java.util.TreeMap

fun main() {
    readNumber(BufferedReader(StringReader("Not Number")))
}

fun readNumber(reader: BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        null
    }

    println(number)
}

fun isLetter(char: Char) = char in 'a'..'z' || char in 'A'..'Z'

fun listIterator() {
    val list = arrayListOf("10", "11", "12")

    for ((index, value) in list.withIndex()) {
        println("$index: $value")
    }
}

fun mapIterator() {
    val binaryReps = TreeMap<Char, String>()

    for (char in 'A'..'F') {
        val binary = Integer.toBinaryString(char.code)
        binaryReps[char] = binary
    }

    for ((letter, binary) in binaryReps) {
        println("$letter = $binary")
    }
}

fun fizzBuzz(num: Int) =
    when {
        num % 15 == 0 -> "FizzBuzz"
        num % 3 == 0 -> "Fizz"
        num % 5 == 0 -> "Buzz"
        else -> "$num"
    }


fun max(a: Int, b: Int) = if (a > b) a else b

fun getKorean(color: Color, color2: Color) =
    when {
        YELLOW == color && ORANGE == color2 -> ""
        GREEN == color && RED == color2 -> ""
        else -> "몰라"
    }

class Person(var name: String?) {

    val isNameEmpty: Boolean
        get() {
            return Objects.isNull(name)
        }

}

