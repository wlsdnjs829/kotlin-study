package com.example.kotlin.kotlin_in_action_7

import java.math.BigDecimal
import java.math.BigInteger

fun main() {
    var bd = BigDecimal.ZERO
    println(bd++)
    println(++bd)
}

data class Point(val x: Int, val y: Int)

operator fun Point.plus(other: Point) = Point(x + other.x, y + other.y)

operator fun Point.unaryMinus() = Point(-x, -y)

operator fun Point.times(scale: Double) = Point((x * scale).toInt(), (y * scale).toInt())

operator fun Char.times(count: Int) = toString().repeat(count)

operator fun <T> MutableCollection<T>.plusAssign(element: T) {
    this.add(element)
}

operator fun BigInteger.inc() = this + BigInteger.ONE