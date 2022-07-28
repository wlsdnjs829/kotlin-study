package com.example.kotlin.kotlin_in_action_5

fun main() {
    println(alphabetRefactor())
}

fun alphabet(): String {
    val result = StringBuilder()

    for (letter in 'A'..'Z') {
        result.append(letter)
    }

    result.append("\nNow I know the alphabet!")
    return result.toString()
}

fun alphabetRefactor() = with(StringBuilder()) {
    for (letter in 'A'..'Z') {
        append(letter)
    }

    append("\nNow I know the alphabet!")
    toString()
}

