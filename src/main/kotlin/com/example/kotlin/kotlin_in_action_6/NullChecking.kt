package com.example.kotlin.kotlin_in_action_6

fun main() {
    strLen(null)
}

fun strLen(s: String?) = s?.length

fun strLenSafe(s: String?) = s?.length ?: 0


