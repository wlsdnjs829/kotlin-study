package com.example.kotlin.kotlin_in_action_etc

/** 1.4의 언어 변화 */
fun interface IntPredicate {
    fun accept(i: Int): Boolean
}

val isEven = IntPredicate { it % 2 == 0 }

fun foo(i: Int = 0): String = "$i"
fun apply(func: () -> String): String = func()

fun fooApply() {
    println(apply(::foo))
}

val numbers = mutableListOf(0, 1, 2, 3, 4, 5)

val runningReduceSum = numbers.runningReduce { sum, item -> sum + item } // [0, 1, 3, 6, 10, 15]
val runningFoldSum = numbers.runningFold(10) { sum, item -> sum + item } // [10, 10, 11, 13, 16, 20, 25]