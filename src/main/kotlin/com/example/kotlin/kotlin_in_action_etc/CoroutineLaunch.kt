package com.example.kotlin.kotlin_in_action_etc

import java.time.LocalTime
import java.time.ZonedDateTime
import java.time.temporal.ChronoUnit
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.yield

fun now(): LocalTime = ZonedDateTime.now().toLocalTime().truncatedTo(ChronoUnit.MILLIS)

fun log(msg: String) = println("${now()} : ${Thread.currentThread()} : $msg")

fun launchInGlobalScope() {
    GlobalScope.launch {
        log("코루틴 시작.")
    }
}

fun runBlockingExample() {
    runBlocking {
        launch {
            log("코루틴 시작.")
        }
    }
}

fun testFun() {
    log("main() 시작.")
    runBlockingExample()
    log("runBlockingExample() 실행")
    Thread.sleep(5000L)
    log("main() 종료.")
}

fun yieldExample() {
    runBlocking {
        launch {
            log("1")
            yield()
            log("3")
            yield()
            log("5")
        }

        log("첫 번째 Launch 동작 이후")

        launch {
            log("2")
            delay(1000L)
            log("4")
            delay(1000L)
            log("6")
        }

        log("두 번째 Launch 동작 이후")
    }
}

fun main() {
    yieldExample()
}