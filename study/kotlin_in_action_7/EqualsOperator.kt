package com.example.kotlin.kotlin_in_action_7

fun main() {
    val person1 = Person("이", "진원")
    val person2 = Person("김", "진원")
    println(person1 < person2)
}

class Person(private val firstName: String, private val lastName: String) : Comparable<Person> {
    override fun compareTo(other: Person): Int {
        return compareValuesBy(this, other, Person::lastName, Person::firstName)
    }
}