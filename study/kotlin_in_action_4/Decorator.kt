package com.example.kotlin.kotlin_in_action_4

fun main() {

}

class DelegatingCollection<T>(
    innerList: Collection<T> = arrayListOf()
) : Collection<T> by innerList

class CountingSet<T>(
    private val innerSet: MutableCollection<T> = HashSet()
) : MutableCollection<T> by innerSet {

    var objectAdded = 0

    override fun add(element: T): Boolean {
        objectAdded++
        return innerSet.add(element)
    }

    override fun addAll(elements: Collection<T>): Boolean {
        objectAdded += elements.size
        return innerSet.addAll(elements)
    }

}