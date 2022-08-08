package com.example.kotlin.kotlin_in_action_7

fun main() {
    val emailPerson = EmailPerson("진원")
    emailPerson.emails
    emailPerson.emails
}

class Email(email: String)

fun loadEmails(person: EmailPerson): List<Email> {
    println(person.name)
    return listOf(Email("wlsdnjs829@naver.com"), Email("wlsdnjs829@gmail.com"))
}

class EmailPerson(val name: String) {
    val emails by lazy { loadEmails(this) }
}