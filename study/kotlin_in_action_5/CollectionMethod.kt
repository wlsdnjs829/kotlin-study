package com.example.kotlin.kotlin_in_action_5

fun main() {
    collectionFlatMap()
}

fun collectionFilter() {
    val people = listOf(Person("진원", 28), Person("젊은 진원", 18))
    println(people.filter { it.age > 20 })
}

fun collectionMap() {
    val people = listOf(Person("진원", 28), Person("젊은 진원", 18))
    println(people.map { it.name })
}

fun collectionTerm() {
    val people = listOf(Person("진원", 28), Person("젊은 진원", 18))

    val function = { p: Person -> p.age <= 27 }

    println(people.all(function)) // 모두 조건에 포함되는가?
    println(people.any(function)) // 일부 조건에 포함되는가?
    println(people.count(function)) // 조건에 포함되는 수는?
    println(people.find(function)) // 조건에 포함되는 첫번째 항목, 없으면 null
}

fun collectionGroupBy() {
    val people = listOf(Person("진원", 28), Person("젊은 진원", 18), Person("미희", 18))
    println(people.groupBy(Person::age))

    val listOf = listOf("a", "ab", "b")
    println(listOf.groupBy(String::first))
}

class Book(val title: String, val authors: List<String>)

fun collectionFlatMap() {
    val listOf = listOf(
            Book("코틀린", listOf("진원")),
            Book("자바", listOf("박교수")),
            Book("자바스크립트", listOf("진원", "헤롱")),
            Book("파이썬", listOf("헤롱")),
    )

    println(listOf.flatMap(Book::authors).toSet())
}
