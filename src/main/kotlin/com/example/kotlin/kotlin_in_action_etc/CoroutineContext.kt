package com.example.kotlin.kotlin_in_action_etc

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.newSingleThreadContext
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        launch {
            println("부모 컨텍스트를 사용 ${Thread.currentThread().name}")
        }

        launch (Dispatchers.Unconfined){
            println("특정 스레드에 종속되지 않음. 메인 스레드 사용 ${Thread.currentThread().name}")
        }

        launch (Dispatchers.Default){
            println("기본 디스채퍼를 사용 ${Thread.currentThread().name}")
        }

        launch (newSingleThreadContext("newThread")){
            println("새 스레드를 사용 ${Thread.currentThread().name}")
        }
    }
}