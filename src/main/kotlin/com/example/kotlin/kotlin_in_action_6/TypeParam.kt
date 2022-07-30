package com.example.kotlin.kotlin_in_action_6

fun main() {
    printHashCode(42)
}

fun <T: Any> printHashCode(t: T) {
    println(t.hashCode())
}