package com.example.kotlin.kotlin_in_action_8

fun main () {
    lambda()
    noLambda()
}

data class Person(val name: String, val age: Int)

fun lambda() {
    val people = listOf(Person("진원", 28), Person("늙진", 38))
    println(people.filter { it.age < 30 })
}

fun noLambda() {
    val people = listOf(Person("진원", 28), Person("늙진", 38))

    val result = mutableListOf<Person>()

    for (person in people) {
        if (person.age < 30) result.add(person)
    }

    println(result)
}