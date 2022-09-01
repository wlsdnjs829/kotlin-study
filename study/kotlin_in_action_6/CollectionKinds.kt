package com.example.kotlin.kotlin_in_action_6

fun main() {
    listToArray()
}

fun arraysAlphabet() {
    val array = Array(26) { i -> ('a' + i).toString() };
    println(array.joinToString())
}

fun listToArray() {
    val listOf = listOf("a", "b", "c")
    println("%s/%s/%s".format(*listOf.toTypedArray()))
}

fun <T> copyElements(source: Collection<T>, target: MutableCollection<T>) {
    for (item in source) {
        target.add(item)
    }
}

fun createArray() {
    val fiveZeros = IntArray(5)
    val fiveZerosToo = intArrayOf(0, 0, 0, 0, 0)
    val squares = IntArray(5) { i -> (i + 1) * (i + 1) }
}