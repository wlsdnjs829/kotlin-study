package com.example.kotlin.kotlin_in_action_3

fun main() {
    val name = "JINWON"
    println(name.lastChar)

    val sb = java.lang.StringBuilder("$name?")
    sb.lastChar = '!'
    println(sb.lastChar)
}

val String.lastChar: Char
    get() = get(length - 1)

var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value: Char) = this.setCharAt(length - 1, value)