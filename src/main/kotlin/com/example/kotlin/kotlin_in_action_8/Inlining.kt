package com.example.kotlin.kotlin_in_action_8

import java.util.concurrent.locks.Lock

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

class LockOwner(val lock: Lock) {
    fun runUnderLock(body: () -> Unit) {
        synchronized(lock, body)
    }
}