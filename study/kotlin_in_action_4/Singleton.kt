package com.example.kotlin.kotlin_in_action_4

import java.io.File

fun main() {
    val files = listOf(File("/a"), File("/z"), File("/user"))
    println(files.sortedWith(CaseInsensitiveFileComparator))
}

object CaseInsensitiveFileComparator : Comparator<File> {

    override fun compare(o1: File, o2: File): Int {
        return o1.path.compareTo(o2.path, ignoreCase = true)
    }

}