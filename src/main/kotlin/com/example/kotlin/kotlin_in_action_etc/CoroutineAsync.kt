package com.example.kotlin.kotlin_in_action_etc

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun sumAll() {
    runBlocking {
        val d1 = async { delay(1000L); 1 }
        log("첫 번째 async 후")

        val d2 = async { delay(2000L); 2 }
        log("두 번째 async 후")

        val d3 = async { delay(3000L); 3 }
        log("세 번째 async 후")

        log("1 + 2 + 3 = ${d1.await() + d2.await() + d3.await()} ")
        log("await가 모두 끝난 경우")

    }
}

fun main() {
    sumAll()
}