package com.example.kotlin.kotlin_in_action_8

import java.io.BufferedReader
import java.io.FileReader
import java.util.concurrent.locks.Lock
import kotlin.concurrent.withLock

fun lock(l: Lock) {
    println("before")

    synchronized(l) {
        println("action")
    }

    println("after")
}

inline fun <T> synchronized(lock: Lock, action: () -> T ): T {
    lock.lock();

    try {
        return action()
    } finally {
        lock.unlock()
    }
}

class LockOwner(private val lock: Lock) {
    fun runUnderLock(body: () -> Unit) {
        synchronized(lock, body)
    }
}

fun readFirstLineFromFile(path:String): String {
    BufferedReader(FileReader(path)).use { br -> return br.readLine() }
}