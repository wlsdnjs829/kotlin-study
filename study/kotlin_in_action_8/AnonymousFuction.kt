package com.example.kotlin.kotlin_in_action_8

fun main() {
    val people = listOf(Person("진원", 28), Person("늙진", 38))
    lookForEachOlder(people)
}

fun lookForEachOlder(people: List<Person>) {
    people.forEach(fun(person) {
        if (person.name == "진원") return
        println("${person.name}은 진원이가 아닙니다.")
    })

    people.filter(fun(person) = person.age > 30)
}
