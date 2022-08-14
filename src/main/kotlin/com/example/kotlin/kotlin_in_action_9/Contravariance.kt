package com.example.kotlin.kotlin_in_action_9

fun main() {
    val anyComparator = Comparator<Any> { e1, e2 ->
        e1.hashCode() - e2.hashCode()
    }

    val strings = listOf("ljw", "jinwon")
    println(strings.sortedWith(anyComparator))

    enumerateCats(Animal::getIndex)
}

fun enumerateCats(f: (Cat) -> Number) {}
fun Animal.getIndex(): Int = 1
