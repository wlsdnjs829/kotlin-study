package com.example.kotlin.kotlin_in_action_2

import com.example.kotlin.kotlin_in_action_2.Color.GREEN
import com.example.kotlin.kotlin_in_action_2.Color.ORANGE
import com.example.kotlin.kotlin_in_action_2.Color.RED
import com.example.kotlin.kotlin_in_action_2.Color.YELLOW
import java.util.Objects

fun main() {
    println(Sum(Num(1), Num(2)).eval())
}

fun max(a: Int, b: Int) = if (a > b) a else b

fun getKorean(color: Color, color2: Color) =
    when {
        YELLOW == color && ORANGE == color2 -> ""
        GREEN == color && RED == color2 -> ""
        else -> "몰라"
    }

class Person(var name: String?) {

    val isNameEmpty: Boolean
        get() {
            return Objects.isNull(name)
        }

}
