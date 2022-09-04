package com.example.kotlin.kotlin_in_action_etc

// 컬렉션의 인스턴스에 대한 타입 별명
typealias Args = Array<String>
fun main(args: Args) {
}

// MyHandler를 받는 고차 함수
typealias MyHandler = (Int, String, Any) -> Unit
fun addHandler(h: MyHandler)

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