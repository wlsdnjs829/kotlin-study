package com.example.kotlin.kotiln_in_action_10

import jkid.JsonExclude
import jkid.JsonName
import jkid.deserialization.deserialize
import jkid.serialization.serialize

fun main() {
    serializeTest()
    deserializeTest()
}

data class Person(
    @JsonName("alias") val name: String,
    @JsonExclude val age: Int? = null)

fun serializeTest() {
    val person = Person("진원", 28)

    println(serialize(person))
}

fun deserializeTest() {
    val json = """{"age": 28, "alias": "진원"}"""
    println(deserialize<Person>(json))
}


