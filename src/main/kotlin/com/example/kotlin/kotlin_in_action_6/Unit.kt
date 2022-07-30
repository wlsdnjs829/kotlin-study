package com.example.kotlin.kotlin_in_action_6

fun main() {
    fail("오류지롱")
}

interface Processor<T> {
    fun process(): T
}

class NoResultProcessor : Processor<Unit> {
    override fun process() {
        // 여기서 return을 명시할 필요가 없음
    }
}

fun fail(message: String): Nothing {
    throw IllegalArgumentException(message)
}