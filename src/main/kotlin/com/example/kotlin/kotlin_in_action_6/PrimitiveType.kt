package com.example.kotlin.kotlin_in_action_6

fun main() {
    typeEquals()
}

fun primitive() {
    var i: Int = 1
    var list: List<Int> = listOf(1, 2, 3)
}

fun typeEquals() {
    val x = 1
    val list = listOf(1L, 2L, 3L)
    println(x.toLong() in list)
}

data class PrimitivePerson(val name: String, val age: Int? = null) {
    fun isOlderThan(other: PrimitivePerson): Boolean? {
        if (age == null || other.age == null) {
            return null
        }

        return age > other.age
    }
}