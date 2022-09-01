package com.example.kotlin.kotlin_in_action_9

fun main() {

}

interface Producer<out T> {
    fun producer(): T
}

open class Animal {
    fun feed() {}
}

class Herd<out T : Animal>(vararg animals: T) {
    val size: Int get() = this.size
    operator fun get(i: Int): T = this[i]
}

fun feedAll(animals: Herd<Animal>) {
    for (i in 0 until animals.size) {
        animals[i].feed()
    }
}

class Cat : Animal() {
    fun cleanLitter() {}
}

fun takeCareOfCats(cats: Herd<Cat>) {
    for (i in 0 until cats.size) {
        cats[i].cleanLitter()
    }

    feedAll(cats)
}