package com.example.kotlin.kotlin_in_action_7

import java.math.BigDecimal
import java.math.BigInteger

fun main() {
    var bd = BigDecimal.ZERO
    println(bd++)
    println(++bd)
}

data class MutablePoint(var x: Int, var y: Int)

operator fun MutablePoint.set(index: Int, value: Int) {
    when (index) {
        0 -> x = value
        1 -> y = value
        else -> throw IndexOutOfBoundsException("유효하지 않은 인덱스 넘버 $index")
    }
}

class Point(val x: Int, val y: Int) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Point

        if (x != other.x) return false
        if (y != other.y) return false

        return true
    }

    override fun hashCode(): Int {
        var result = x
        result = 31 * result + y
        return result
    }
}

operator fun Point.get(index: Int) = when (index) {
    0 -> x
    1 -> y
    else -> throw IndexOutOfBoundsException("유효하지 않은 인덱스 넘버 $index")
}

operator fun Point.plus(other: Point) = Point(x + other.x, y + other.y)

operator fun Point.unaryMinus() = Point(-x, -y)

operator fun Point.times(scale: Double) = Point((x * scale).toInt(), (y * scale).toInt())

operator fun Char.times(count: Int) = toString().repeat(count)

operator fun <T> MutableCollection<T>.plusAssign(element: T) {
    this.add(element)
}

operator fun BigInteger.inc() = this + BigInteger.ONE