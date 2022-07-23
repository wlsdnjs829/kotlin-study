package com.example.kotlin.kotlin_in_action_3

fun main() {
    kotlinLogo()
}

fun collection() {
    hashSetOf(1, 7, 53)
    arrayListOf(1, 7, 53)
    hashMapOf(1 to "ONE", 7 to "SEVEN", 52 to "FIFTY-THREE")
}

fun listToString() {
    val listOf = listOf(1, 2, 3)
    println(listOf)
}

fun regexSplit() {
    println("12.345-6.A".split("[.\\-]".toRegex()))
}

fun regexSplit2() {
    println("12.345-6.A".split(".", "-"))
}

fun parsePath(path: String) {
    val directory = path.substringBeforeLast("/")
    val fullName = path.substringAfterLast("/")

    val fileName = fullName.substringBeforeLast(".")
    val extension = fullName.substringAfterLast(".")

    println("Dir: $directory, Name: $fileName, Ext: $extension")
}

fun parsePathLib(path: String) {
    val regex = """(.+)/(.+)\.(.+)""".toRegex()
    val matchResult = regex.matchEntire(path)

    if (matchResult != null) {
        val (directory, fileName, extension) = matchResult.destructured
        println("Dir: $directory, Name: $fileName, Ext: $extension")
    }
}

fun kotlinLogo() {
    val logo = """|  //
                 .| //
                 .|// \ """.trimMargin(".")

    println(logo)
}