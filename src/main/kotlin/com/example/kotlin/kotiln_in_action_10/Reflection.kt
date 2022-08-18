package com.example.kotlin.kotiln_in_action_10

import kotlin.reflect.full.memberProperties

var counter = 0

fun main() {
    reflect()

    val kFunction = ::foo
    kFunction.call(42)

    val kFunction2 = ::sum
    println(kFunction2.invoke(1, 2) + kFunction2.invoke(3, 4))

    val kProperty = ::counter
    kProperty.setter.call(21)
    println(kProperty.get())

    val person = Person("진원", 28)
    val memberProperty = Person::age
    println(memberProperty.get(person))
}

fun reflect() {
    val person = Person("진원", 28)
    val kClass = person.javaClass.kotlin

    println(kClass.simpleName)
    kClass.memberProperties.forEach { println(it.name) }
}

fun foo(x: Int) = println(x)

fun sum(x: Int, y: Int) = x + y