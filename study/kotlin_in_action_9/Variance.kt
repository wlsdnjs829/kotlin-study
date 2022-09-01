package com.example.kotlin.kotlin_in_action_9

import kotlin.collections.List

fun main() {
    val strings = mutableListOf("abc", "bac")
//    addAnswer(strings)
    println(strings.maxByOrNull { it.length })
}

fun printContents(list: List<Any>) {
    println(list.joinToString())
}

fun addAnswer(list: MutableList<Any>) {
    list.add(42)
}