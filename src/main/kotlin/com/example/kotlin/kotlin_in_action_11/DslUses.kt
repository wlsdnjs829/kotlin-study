package com.example.kotlin.kotlin_in_action_11

fun main() {
    "kotlin" should start with "kot"
}

infix fun <T> T.should(matcher: Matcher<T>) = matcher.test(this)

interface Matcher<T> {
    fun test(value: T)
}

class startWith(private val prefix: String) : Matcher<String> {
    override fun test(value: String) {
        if (!value.startsWith(prefix)) {
            throw AssertionError("$value 이 문자열은 ${prefix}로 시작하지 않는다.")
        }
    }
}

object start

infix fun String.should(x: start): StartWrapper = StartWrapper(this)

class StartWrapper(val value: String) {
    infix fun with(prefix: String) =
        if (!value.startsWith(prefix))
            throw AssertionError("$value 이 문자열은 ${prefix}로 시작하지 않는다.")
        else
            Unit
}