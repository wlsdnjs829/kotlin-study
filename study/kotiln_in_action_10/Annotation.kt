package com.example.kotlin.kotiln_in_action_10

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

const val MESSAGE = "Use removeAt(index) instead."

fun main() {
    remove(1)
}

class MyTest {

    @Test
    fun testTrue() {
        assertTrue(true)
    }

}

@Deprecated(MESSAGE, ReplaceWith("removeAt(index)"))
fun remove(index: Int) {}