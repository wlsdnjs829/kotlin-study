package com.example.kotlin.kotiln_in_action_10

import jkid.DeserializeInterface
import jkid.serialization.serialize

fun main() {
    println(serialize(CompanyPerson("진원", CompanyImpl("진원"))))
}

interface Company {
    val name: String
}

data class CompanyImpl(override val name: String) : Company

data class CompanyPerson(
    val name: String,
    @DeserializeInterface(CompanyImpl::class) val company: Company
)
