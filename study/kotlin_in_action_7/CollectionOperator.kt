package com.example.kotlin.kotlin_in_action_7

import java.time.LocalDate

fun main() {
    val person1 = Person("이", "진원")
    val person2 = Person("김", "진원")
    println(person1 < person2)

    val now = LocalDate.now()
    val vacation = now..now.plusDays(10)
    println(now.plusMonths(1) in vacation)

    val newYear = LocalDate.ofYearDay(2023, 1)
    val days = newYear.minusDays(1)..newYear

    for (day in days) {
        println(day)
    }
}

operator fun ClosedRange<LocalDate>.iterator(): Iterator<LocalDate> =
    object : Iterator<LocalDate> {
        var current = start

        override fun hasNext() = current <= endInclusive

        override fun next() = current.apply {
            current = plusDays(1)
        }
    }

data class Rectangle(val upperLeft: Point, val lowerRight: Point)

operator fun Rectangle.contains(p: Point) =
    p.x in upperLeft.x until lowerRight.x && p.y in upperLeft.y until lowerRight.y