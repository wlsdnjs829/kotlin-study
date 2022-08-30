package com.example.kotlin.kotlin_in_action_11

fun main() {
    val greeter = Greeter("반갑습니다")
    greeter("진원")
}

class Greeter(private val greeting: String) {
    operator fun invoke(name: String) {
        println("$greeting, $name")
    }
}