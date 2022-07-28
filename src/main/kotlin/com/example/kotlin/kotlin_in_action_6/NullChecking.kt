package com.example.kotlin.kotlin_in_action_6

import java.util.Locale

fun main() {
    val person = Person("진원", null)
    println(person.countryName())
}

fun strLen(s: String?) = s?.length

fun strLenSafe(s: String?) = s?.length ?: 0

fun printAllCaps(s: String?) {
    val allCaps: String? = s?.uppercase(Locale.getDefault());
    println(allCaps)
}

class Employee(val name: String, val manager: Employee?)

fun managerName(employee: Employee) = employee.manager?.name

fun department() {
    val ceo = Employee("진원", null)
    val developer = Employee("젊은진원", ceo)

    println(managerName(developer))
    println(managerName(ceo))
}

class Address(val streetAddress: String, val zip: Int, val city: String, val country: String)
class Company(val name: String, val address: Address?)
class Person(val name: String, val company: Company?)

fun Person.countryName(): String {
    val country = this.company?.address?.country
    return country ?: "Unknown"
}
