package com.example.kotlin.kotlin_in_action_4

fun main() {
    val client = Client("이진원", 1234)
    println(client.copy())
}

data class Client(val name: String, val postalCode: Int)