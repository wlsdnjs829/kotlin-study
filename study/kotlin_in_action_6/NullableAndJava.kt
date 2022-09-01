package com.example.kotlin.kotlin_in_action_6

fun main() {

}

class StringPrinter : StringProcessor {
    override fun process(value: String?) {
        value?.let { println(value) }
    }
}
