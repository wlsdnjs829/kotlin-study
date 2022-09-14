package com.example.kotlin.small_seminar

import java.io.Serializable

class `4_클래스` {

    interface State : Serializable

    interface View {

        fun getCurrentState(): State
        fun restoreState(state: State) {}

    }

    class ViewButton : View {

        override fun getCurrentState() = ButtonState()
        override fun restoreState(state: State) = super.restoreState(state)
        class ButtonState : State {} // 자바의 정적 중첩 클래스와 대응

    }

    class Outer {

        inner class Inner(val s: String) {
            fun getOuterReference() = this@Outer // 내부 클래스에서 바깥쪽 클래스 참조에 접근하려면 this@Outer라고 명시해야 한다.
        }

    }

    interface User {
        val nickName: String
    }

    class PrivateUser(override val nickName: String) : User

    class SubscribingUser(private val email: String) : User {

        override var nickName: String = ""
            get() = email.substringBefore('@') // 커스텀 게터
            set(value) {
                field = value
            }

    }

    data class Client(val name: String, val postalCode: Int)

}

