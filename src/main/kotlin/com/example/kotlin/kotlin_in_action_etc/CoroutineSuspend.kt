package com.example.kotlin.kotlin_in_action_etc

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.yield

suspend fun yieldThreeTimes() {
    log("1")
    delay(1000)
    yield()
    log("2")
    delay(1000)
    yield()
    log("3")
    delay(1000)
    yield()
    log("4")
}

fun suspendExample() {
    GlobalScope.launch { yieldThreeTimes() }
}

suspend fun example(v: Int) = v * 2