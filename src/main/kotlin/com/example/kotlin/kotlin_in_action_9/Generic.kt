package com.example.kotlin.kotlin_in_action_9

fun main() {

}

fun slice() {
    val letters = ('a'..'z').toList()
    println(letters.slice<Char>(0..2))
    println(letters.slice(10..13))
}
