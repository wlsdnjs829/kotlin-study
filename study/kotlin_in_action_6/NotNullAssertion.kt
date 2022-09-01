package com.example.kotlin.kotlin_in_action_6

import java.awt.event.ActionEvent
import javax.swing.AbstractAction
import javax.swing.JList

fun main() {
    ignoreNulls(null)
}

fun ignoreNulls(s: String?) {
    val sNotNull: String = s!!
    println(sNotNull.length)
}

class CopyRowAction(private val list: JList<String>) : AbstractAction() {
    override fun isEnabled(): Boolean =
        list.selectedValue != null

    override fun actionPerformed(e: ActionEvent?) { // actionPerformed의 경우 isEnabled가 true인 경우만 실행된다
        val value = list.selectedValue
        println(value)
    }
}