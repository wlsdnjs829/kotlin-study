package com.example.kotlin.kotiln_in_action_10

import com.fasterxml.jackson.databind.ser.std.DateSerializer
import kotlin.reflect.KClass

interface ValueSerializer<T> {
    fun toJsonValue(value: T): Any?
    fun fromJsonValue(jsonValue: Any?): T
}

data class GenericPerson(
    val name: String,
    @CustomSerializer(DateSerializer::class) val company: Company
)

annotation class CustomSerializer(val serializerClass: KClass<out DateSerializer>)