package com.example.kotlin.kotlin_in_action_3

open class View {
}

class Button : View() {
}

fun main() {
    fun View.showOff() = println("View")
    fun Button.showOff() = println("Button")

    val view: View = Button()
    println(view.showOff())
}