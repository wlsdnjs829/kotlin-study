package com.example.kotlin.kotlin_in_action_4

fun main() {
    CompanionPerson.fromJSON("")
}

class A {

    companion object {

        fun bar() {
            println("companion object Bar")
        }
    }

}

class FactoryUser private constructor(val nickName: String) { // 주 생성자를 비공개로 만든다.

    companion object { // 동반 객체 선언
        fun newSubscribingUser(email: String) = FactoryUser(email.substringBefore('@'))
//        fun newFacebookUser(facebookAccountId: Int) = FactoryUser(getFacebookName(facebookAccountId))
    }

}

interface JSONFactory<T> {
    fun fromJSON(jsonText: String): T
}

class Person(val name: String) {

    companion object : JSONFactory<Person> {
        override fun fromJSON(jsonText: String): Person {
            return Person(jsonText)
        }
    }

}

fun <T> loadFromJSON(factory: JSONFactory<T>, string: String): T {
    return factory.fromJSON(string)
}

class CompanionPerson(val firstName: String, val lastName: String) {
    companion object
}

fun CompanionPerson.Companion.fromJSON(jsonText: String) : CompanionPerson {
    return CompanionPerson("진원", "이")
}