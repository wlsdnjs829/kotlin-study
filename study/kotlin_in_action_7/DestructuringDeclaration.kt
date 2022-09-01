package com.example.kotlin.kotlin_in_action_7

fun main() {
    val (x, y) = MutablePoint(10, 20)
    println(x)
    println(y)

    val (name, ext) = splitFilename("example.txt")
    println("$name + $ext")

    val map = mapOf("Oracle" to "Java", "JetBrains" to "Kotiln")
    printEntries(map)
}

data class NameComponents(val name: String, val extension: String)

fun splitFilename(fullName: String): NameComponents {
    val (name, ext) = fullName.split('.', limit = 2)
    return NameComponents(name, ext)
}

fun printEntries(map: Map<String, String>) {
    for ((key, value) in map) {
        println("$key -> $value")
    }
}