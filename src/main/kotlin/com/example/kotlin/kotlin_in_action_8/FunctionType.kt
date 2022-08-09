package com.example.kotlin.kotlin_in_action_8

fun main() {
    println("ab1c".filter { it in 'a'..'z' })
}

fun twoAndThree(operation: (Int, Int) -> Int) {
    val result = operation(2, 3)
    println("결과는 $result")
}

fun String.filter(predicate: (Char) -> Boolean) : String {
    val sb = StringBuilder()

    for (index in 0 until length) {
        val element = get(index)

        if (predicate(element)) {
            sb.append(element)
        }
    }

    return sb.toString()
}

fun processTheAnswer(f: (Int) -> Int) {
    println(f(42))
}
