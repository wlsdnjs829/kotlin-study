package com.example.kotlin.kotlin_in_action_etc

import kotlin.math.sqrt

// 컬렉션의 인스턴스에 대한 타입 별명
typealias Args = Array<String>

// MyHandler를 받는 고차 함수
typealias MyHandler = (Int, String, Any) -> Unit

fun addHandler(h: MyHandler) {}

// 제네릭 타입 별명
typealias StringKeyMap<V> = Map<String, V>

val myMap: StringKeyMap<Int> = mapOf("ONE" to 1, "TWO" to 2)

// 중첩 클래스
class Foo {
    class Bar {
        inner class Baz
    }
}

typealias FooBarBaz = Foo.Bar.Baz

val toplevel: Double
    inline get() = Math.PI

class InlinePropExample(var value: Int) {
    var setOnly: Int
        get() = value
        inline set(v) {
            value = v
        }
}

inline var InlinePropExample.square: Int
    get() = value * value
    set(v) {
        value = sqrt(v.toDouble()).toInt()
    }