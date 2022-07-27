package com.example.kotlin.kotlin_in_action_5

fun main() {
    mapToFilterOrderTest()
}

fun lazyCollection() {
    val people = listOf(Person("진원", 28), Person("젊은 진원", 18))

    val toList = people.asSequence()
            .map(Person::name)
            .filter { it.startsWith("진") }
            .toList()

    println(toList)
}

fun lazyCallTest() {
    val people = listOf(1, 2, 3, 4)

    people.asSequence()
            .map { println("map ($it) "); it * it }
            .filter { println("filter ($it) "); it % 2 == 0 }
            .toList()
}

fun mapToFind() {
    val people = listOf(1, 2, 3, 4)

    people.asSequence()
            .map { println("map ($it) "); it * it }
            .find { println("find ($it) "); it > 3 }
}

fun mapToFilterOrderTest() {
    val people = listOf(Person("진원", 28), Person("젊은 진원", 18),
            Person("밝은 진원", 18), Person("미히", 18))

    people.asSequence()
            .map { println("map ($it) "); it.name }
            .filter { println("filter ($it) "); it.length < 4 }
            .toList()
}

fun generateSequenceTest() {
    val generateSequence = generateSequence(0) { it + 1 }
    val numberTo100 = generateSequence.takeWhile { it < 100 }
    println(numberTo100.sum())
}