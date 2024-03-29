package com.example.kotlin.kotlin_in_action_etc

import kotlin.math.sqrt
import kotlin.reflect.KProperty

/**
 * 타입 별명
 */
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

/**
 * 프로퍼티 접근자 인라이닝
 */
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

/**
 *  제네릭 타입으로 이넘 값 접근
 */
enum class DAYSOFWEEK { MON, TUE, WED, THR, FRI, SAT, SUN }

inline fun <reified T : Enum<T>> mkString() : String =
    buildString {
        for (v in enumValues<T>()) {
            append(v)
            append(",")
        }
    }

//fun main() {
//    println(mkString<DAYSOFWEEK>())
//}

/**
 * 로컬 변수 등을 위임
 */
class BarDelegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>) : Int {
        println("thisRef = $thisRef")
        println("property.name = ${property.name}")
        return 100
    }
}

val y: Int by BarDelegate()

//fun main() {
//    val x: Int by BarDelegate()
//    println("x = $x, y = $y")
//}