package com.example.kotlin.kotlin_in_action_11

import kotlinx.html.stream.createHTML
import kotlinx.html.table
import kotlinx.html.td
import kotlinx.html.tr

fun main() {
    println(createTable())
    println(createAnotherTable())
}

fun createSimpleTableEx() = createHTML()
    .table {
        (this@table).tr {
            (this@tr).td {
                +"cell"
            }
        }
    }

open class Tag(val name: String) {
    private val children = mutableListOf<Tag>()
    protected fun <T : Tag> doInit(child: T, init: T.() -> Unit) {
        child.init()
        children.add(child)
    }
    override fun toString(): String =
        "<$name>${children.joinToString("")}</$name>"
}

fun table(init: TABLE.() -> Unit) = TABLE().apply(init)

class TABLE : Tag("table") {
    fun tr(init: TR.() -> Unit) = doInit(TR(), init)
}

class TR : Tag("tr") {
    fun td(init: TD.() -> Unit) = doInit(TD(), init)
}

class TD : Tag("td")

fun createTable() =
    table {
        tr {
            td {

            }
        }
    }

fun createAnotherTable() = table {
    for (i in 1..3) {
        tr {
            td {

            }
        }
    }
}