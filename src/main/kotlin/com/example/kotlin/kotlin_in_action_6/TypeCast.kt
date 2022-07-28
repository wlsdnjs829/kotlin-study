package com.example.kotlin.kotlin_in_action_6

fun main() {
    val m1 = Member("진원", "이")
    val m2 = Member("진원", "이")

    println(m1 == m2)
    println(m1.equals(41))
}

class Member(private val firstName: String, private val lastName: String) {
    override fun equals(other: Any?): Boolean {
        val otherMember = other as? Member ?: return false

        return otherMember.firstName == firstName &&
                otherMember.lastName == lastName
    }

    override fun hashCode(): Int =
        firstName.hashCode() * 37 + lastName.hashCode() * 37
}