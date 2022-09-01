package com.example.kotlin.kotlin_in_action_9

import java.util.ServiceLoader
import org.springframework.stereotype.Service

fun main() {
    val serviceImpl = ServiceLoader.load(Service::class.java)
    val service = loadService<Service>()
}

inline fun <reified T> loadService(): ServiceLoader<T> = ServiceLoader.load(T::class.java)

