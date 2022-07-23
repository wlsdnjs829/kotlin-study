package com.example.kotlin.kotlin_in_action_3

fun main() {
    val strings = arrayOf("first", "second", "third")
    val listOf = listOf(*strings)
    println(listOf)
}

fun last() {
    val strings = listOf("first", "second", "third")
    println(strings.last())
}

fun max() {
    val numbers = listOf(1, 14, 2)
    println(numbers.maxOrNull())
}

