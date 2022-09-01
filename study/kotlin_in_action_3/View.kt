package com.example.kotlin.kotlin_in_action_3

import com.example.kotlin.kotlin_in_action_4.A

open class View {
    fun bar() {
        A.bar()
    }
}

class Button : View() {
}

fun main() {
    fun View.showOff() = println("View")
    fun Button.showOff() = println("Button")
    val view: View = Button()
    println(view.showOff())
}