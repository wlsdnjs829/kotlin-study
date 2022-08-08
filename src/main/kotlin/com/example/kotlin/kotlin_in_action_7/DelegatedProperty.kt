package com.example.kotlin.kotlin_in_action_7

import kotlin.reflect.KProperty

fun main() {
    val foo = Foo()
    val oldValue = foo.p
    println(oldValue)

    foo.p = "hi"
}

class Foo {
    var p: Any by Delegate()
}class Delegate {
    operator fun getValue(foo: Foo, property: KProperty<*>): Any {
        return "jinwon"
    }

    operator fun setValue(foo: Foo, property: KProperty<*>, any: Any) {
    }
}


