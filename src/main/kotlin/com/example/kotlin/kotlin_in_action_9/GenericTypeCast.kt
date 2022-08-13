package com.example.kotlin.kotlin_in_action_9

import kotlin.collections.List

fun main() {
    printSum(listOf(1, 2, 3))
//    printSum(setOf(1, 2, 3))
//    printSum(listOf("a", "b", "c"))
}

fun printSum(c: Collection<Int>) {
    if (c is List<Int>) {
        println(c.sum())
    }
}
