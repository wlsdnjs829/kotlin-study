package com.example.kotlin.kotlin_in_action_6

fun main() {
    verifyUserInput("진원")
    verifyUserInput(null)
    verifyUserInput(" ")
}

fun verifyUserInput(input: String?) {
    if (input.isNullOrBlank()) {
        println("비어 있는 객체")
    }
}

fun String?.isNullOrBlank() = this == null || this.isBlank()