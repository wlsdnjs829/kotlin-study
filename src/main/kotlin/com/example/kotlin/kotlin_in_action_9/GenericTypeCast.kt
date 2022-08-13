package com.example.kotlin.kotlin_in_action_9

import kotlin.collections.List

fun main() {
    printSum(listOf(1, 2, 3))
//    printSum(setOf(1, 2, 3))
//    printSum(listOf("a", "b", "c"))

    println(isA<String>(123))

    val items = listOf("one", 2, "three")
    println(items.filterIsInstance<String>())
}

fun printSum(c: Collection<Int>) {
    if (c is List<Int>) {
        println(c.sum())
    }
}

inline fun <reified T> isA(value: Any) = value is T