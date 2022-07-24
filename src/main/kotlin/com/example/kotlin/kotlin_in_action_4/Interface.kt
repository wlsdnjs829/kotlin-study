package com.example.kotlin.kotlin_in_action_4

fun main() {
    println(PrivateUser("ljw0829@midasin.com").nickName)
    println(SubscribingUser("ljw0829@midasin.com").nickName)
}

interface Clickable {
    fun click()
    fun showOff() = println("I`m clickable!")
}

interface Focusable {
    fun serFocus(b: Boolean) = println(" I ${if (b) "got" else "lost"} focus.")
    fun showOff() = println("I`m focusable!")
}

class Button : Clickable, Focusable {

    override fun click() {
        println("I was clicked")
    }

    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }

}

open class RichButton : Clickable { // 이 클래스는 다른 클래스가 상속 가능하다.

    fun disable() {} // 이 함수는 파이널이다. 하위 클래스가 이 메서드를 오버라이드할 수 없다.

    open fun animate() {} // 이 메서드는 하위 클래스에서 오버라이드 가능하다.

    final override fun click() {} // 이 함수는 열려있는 메서드를 오버라이드한다. 오버라이드한 메서드는 기본적으로 열려있다.

}

interface User {
    val nickName: String
}

class PrivateUser(override val nickName: String) : User

class SubscribingUser(private val email: String) : User {

    override val nickName: String
        get() = email.substringBefore('@') // 커스텀 게터

}