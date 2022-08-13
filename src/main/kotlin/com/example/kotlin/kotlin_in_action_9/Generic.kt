package com.example.kotlin.kotlin_in_action_9

fun main() {
    println(oneHalf(3))

    println(max("kotiln", "java"))

    val seq = StringBuilder("Hello World")
    ensureTrailingPeriod(seq)
    println(seq)
}

fun slice() {
    val letters = ('a'..'z').toList()
    println(letters.slice<Char>(0..2))
    println(letters.slice(10..13))
}

fun <T : Number> oneHalf(value: T): Double {
    return value.toDouble() / 2.0
}

interface List<T> {
    operator fun get(index: Int): T
    fun <T : Number> List<T>.sum(): T
}

class StringList : List<String> {
    override fun get(index: Int): String = this[index]
    override fun <T : Number> List<T>.sum(): T {
        TODO("Not yet implemented")
    }
}

class ArrayList<T> : List<T> {
    override fun get(index: Int): T = this[index]
    override fun <T : Number> List<T>.sum(): T {
        TODO("Not yet implemented")
    }
}

fun <T : Comparable<T>> max(first: T, second: T): T {
    return if (first > second) first else second
}

fun <T> ensureTrailingPeriod(seq: T)
        where T : CharSequence, T : Appendable {
    if (!seq.endsWith('.')) {
        seq.append('.')
    }
}