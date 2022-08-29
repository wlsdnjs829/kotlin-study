package com.example.kotlin.kotlin_in_action_11

import kotlinx.html.BUTTON
import kotlinx.html.DIV
import kotlinx.html.TagConsumer
import kotlinx.html.UL
import kotlinx.html.a
import kotlinx.html.button
import kotlinx.html.classes
import kotlinx.html.div
import kotlinx.html.li
import kotlinx.html.role
import kotlinx.html.span
import kotlinx.html.stream.createHTML
import kotlinx.html.table
import kotlinx.html.td
import kotlinx.html.tr
import kotlinx.html.ul

fun main() {
    println(createTable())
    println(createAnotherTable())
    println(buildDropdown())
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

fun buildDropdown() = createHTML().div(classes = "dropdown") {
    button(classes = "btn dropdown-toggle") {
        +"Dropdown"
        span(classes = "caret")
    }
    ul(classes = "dropdown-menu") {
        li { a("#") { +"Action" } }
        li { a("#") { +"Another action" } }
        li { role = "separator"; classes = setOf("divider") }
        li { classes = setOf("dropdown-header"); +"Header" }
        li { a("#") { +"Separated link" } }
    }
}

fun dropdownExample() = createHTML().dropdown {
    dropdownButton { +"Dropdown" }
    dropdownMenu {
        item("#", "Action")
        item("#", "Another action")
        divider()
        dropdownHeader("Header")
        item("#", "Separated link")
    }
}

fun TagConsumer<String>.dropdown(block: DIV.() -> Unit) = div("dropdown", block)

fun DIV.dropdownButton(block: BUTTON.() -> Unit) = button(classes = "btn dropdown-toggle", block = block)

fun DIV.dropdownMenu(block: UL.() -> Unit) = ul(classes = "dropdown-menu", block)

fun UL.dropdownHeader(text: String) {
    li { classes = setOf("dropdown-header"); +text }

}

fun UL.divider() {
    li { role = "separator"; classes = setOf("divider") }
}

fun UL.item(href: String, name: String) {
    li { a(href) { +name } }
}
