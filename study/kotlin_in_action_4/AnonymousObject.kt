package com.example.kotlin.kotlin_in_action_4

import java.awt.Window
import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent

fun main() {

}

fun countClicks(window: Window) {
    var clickCount = 0

    window.addMouseListener(object : MouseAdapter() {
        override fun mouseClicked(e: MouseEvent) {
            clickCount++ // 함수의 변수에 접근
        }
    })
}
