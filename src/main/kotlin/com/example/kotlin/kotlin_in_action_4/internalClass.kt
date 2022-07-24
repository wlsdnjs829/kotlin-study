package com.example.kotlin.kotlin_in_action_4

import java.io.Serializable

fun main() {

}

interface State : Serializable

interface View {

    fun getCurrentState(): State
    fun restoreState(state: State) {}

}

class ViewButton: View {

    override fun getCurrentState() = ButtonState()
    override fun restoreState(state: State) = super.restoreState(state)
    class ButtonState: State // 자바의 정적 중첩 클래스와 대응

}

class Outer {

    inner class Inner {
        fun getOuterReference() = this@Outer
    }

}