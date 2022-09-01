package com.example.kotlin.kotlin_in_action_9

import java.util.Random
import kotlin.collections.List
import kotlin.reflect.KClass

fun main() {
    printFirst(listOf("진원", "젊은 진원"))

    Validators.registerValidator(String::class, DefaultStringValidator)
    Validators.registerValidator(Int::class, DefaultIntValidator)

    println(Validators[String::class].validator("Kotlin"))
    println(Validators[Int::class].validator(42))
}

fun test() {
    val list: MutableList<Any?> = mutableListOf('a', 1, "qwe")
    val chars = mutableListOf('a', 'b', 'c')
    val unknownElement: MutableList<*> = if (Random().nextBoolean()) list else chars
//    unknownElement.add(32)
    println(unknownElement.first())
}

fun <T> printFirst(list: List<T>) {
    if (list.isNotEmpty()) {
        println(list.first())
    }
}

interface FieldValidator<in T> {
    fun validator(input: T): Boolean
}

object DefaultStringValidator : FieldValidator<String> {
    override fun validator(input: String): Boolean {
        return input.isNotEmpty()
    }
}

object DefaultIntValidator : FieldValidator<Int> {
    override fun validator(input: Int): Boolean {
        return input > 0
    }
}

object Validators {
    private val validators = mutableMapOf<KClass<*>, FieldValidator<*>>()

    fun <T : Any> registerValidator(kClass: KClass<T>, fieldValidator: FieldValidator<T>) {
        validators[kClass] = fieldValidator
    }

    @Suppress("UNCHECKED_CAST")
    operator fun <T : Any> get(kClass: KClass<T>): FieldValidator<T> =
        validators[kClass] as? FieldValidator<T>
            ?: throw IllegalArgumentException("${kClass.simpleName}의 유효성 검사기가 아닙니다.")
}