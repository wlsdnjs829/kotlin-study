package com.example.kotlin.kotlin_in_action_11

import kotlinx.html.stream.createHTML
import kotlinx.html.table
import kotlinx.html.td
import kotlinx.html.tr

fun main() {
    println(createSimpleTable())
}

fun createSimpleTable() = createHTML().table {
    val numbers = mapOf(1 to "one", 2 to "two")

    for ((num, string) in numbers) {
        tr {
            td { +"$num" }
            td { +string }
        }
    }
}

