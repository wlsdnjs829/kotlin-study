package com.example.kotlin.kotlin_in_action_9

fun main() {
    println(nullProcessor())
}

fun nullProcessor() {
    val nullableStringProcessor = Processor<String>()
    nullableStringProcessor.process("진원")
}

class Processor<T : Any> {
    fun process(value: T) {
        value.hashCode()
    }
}