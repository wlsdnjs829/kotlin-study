package com.example.kotlin.kotlin_in_action_etc

/**
 * 지연 초기화 개선
 */
lateinit var url :String

fun test() {
    if (::url.isInitialized) {

    }
}

fun collection() {
    val l = listOf(1,2,3,4,5,6,7)
    println("l = $l")

    println("l.chunked(size=3)")
    l.chunked(size = 3).forEach { println(it) }

    println("l.windowed(size = 3, step = 1)")
    l.windowed(size = 3, step = 1).forEach { println(it) }

    println("l.zipWithNext")
    l.zipWithNext { x, y -> println("$x, $y") }
}