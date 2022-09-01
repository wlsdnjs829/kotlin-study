package com.example.kotlin.kotlin_in_action_8

fun main() {
    val calculator = getShippingCostCalculator(Delivery.EXPEDITED)
    println("쇼핑 비용은 ${calculator(Order(3))}")

    val contacts = listOf(
        UiPerson("진원", "이", "123-4567"),
        UiPerson("미희", "박", null)
    )

    val contactListFilters = ContactListFilters()

    with(contactListFilters) {
        prefix = "진"
        onlyWithPhoneNumber = true
    }

    println(contacts.filter(contactListFilters.getPredicate()))
}

enum class Delivery {
    STANDARD,
    EXPEDITED,
}

class Order(val itemCount: Int)

fun getShippingCostCalculator(delivery: Delivery): (Order) -> Double {
    if (Delivery.EXPEDITED == delivery) {
        return { order -> 6 + 2.1 * order.itemCount }
    }

    return { order -> 1.2 * order.itemCount }
}

class ContactListFilters {
    var prefix = ""
    var onlyWithPhoneNumber = false

    fun getPredicate(): (UiPerson) -> Boolean {
        val startsWithPrefix = { p: UiPerson ->
            p.firstName.startsWith(prefix) || p.lastName.startsWith(prefix)
        }

        if (!onlyWithPhoneNumber) {
            return startsWithPrefix
        }

        return { startsWithPrefix(it) && it.phoneNumber != null }
    }
}

data class UiPerson(val firstName: String, val lastName: String, val phoneNumber: String?)
