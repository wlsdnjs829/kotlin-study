package com.example.kotlin.kotlin_in_action_8

fun main() {
    println(log.averageDurationFor { it.os in setOf(OS.ANDROID, OS.MAC) })
    println(log.averageDurationFor { it.os == OS.IOS && it.path == "/signup" })
}

data class SiteVisit(
    val path: String,
    val duration: Double,
    val os: OS
)

enum class OS { WINDOWS, LINUX, MAC, IOS, ANDROID }

val log = listOf(
    SiteVisit("/", 34.0, OS.WINDOWS),
    SiteVisit("/", 22.0, OS.MAC),
    SiteVisit("/login", 12.0, OS.WINDOWS),
    SiteVisit("/signup", 8.0, OS.IOS),
    SiteVisit("/", 16.3, OS.ANDROID),
)

fun List<SiteVisit>.averageDurationFor(predicate: (SiteVisit) -> Boolean) =
    filter(predicate)
        .map { it.duration }
        .average()