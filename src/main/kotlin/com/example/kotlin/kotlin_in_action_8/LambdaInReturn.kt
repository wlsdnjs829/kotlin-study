package com.example.kotlin.kotlin_in_action_8

fun main() {
    val people = listOf(Person("진원", 28), Person("늙진", 38))
    lookForEachOlder(people)
}

fun lookForOlder(people: List<Person>) {
    for (person in people) {
        if (person.name == "늙진") {
            println("찾았다!")
            return
        }
    }
}

fun lookForEachOlder(people: List<Person>) {
    people.forEach {
        if (it.name == "늙진") {
            println("찾았다!")
            return
        }
    }
}


