package com.example.kotlin.kotlin_in_action_11

fun main() {
    val s = buildString {
        append("Hello, ")
        append("World!")
    }

    println(s)

    val appendExcl: StringBuilder.() -> Unit = { this.append("!") }
    val stringBuilder = StringBuilder("HI")
    stringBuilder.appendExcl()
    println(stringBuilder)
    println(buildString(appendExcl))
}

fun buildString(builderAction: StringBuilder.() -> Unit): String {
    val sb = StringBuilder()
    sb.builderAction()
    return sb.toString()
}


