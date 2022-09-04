@file:OptIn(ExperimentalContracts::class)

package com.example.kotlin.kotlin_in_action_etc

import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

/** 컨트랙트 */
fun require(condition: Boolean) {
    // "이 함수가 정상적으로 반환되면 condition이 참이다"라는 조건을 표현하는 컨트랙트
    contract { returns() implies condition }
    if (!condition) throw IllegalArgumentException()
}

fun foo(s: String?) {
    require(s is String)
    s.length
}

fun synchronize(block: () -> Unit) {
    // "이 함수는 block을 여기서 바로 실행하며 오직 한 번만 실행한다"라는 뜻의 컨트랙트
    contract { callsInPlace(block, InvocationKind.EXACTLY_ONCE) }
}

fun foo2() {
    val x: Int

    synchronize {
        x = 42 // 이 블록을 단 한 번만 실행한다는 사실을 컴파일러가 알고 있으므로 val에 값을 재대입한다는 오류 메시지를 표시하지 않음
    }

    println(x) // 바로 위에 람다 블록이 한 번 실행된다는 사실을 컴파일러가 알기 때문에 오류를 발생하지 않음
}

/** copyInto() */
fun copyInto() {
    val sourceArr = arrayOf("k", "o", "t", "l", "i", "n")
    val targetArr = sourceArr.copyInto(arrayOfNulls(6), 3, startIndex = 3, endIndex = 6)
    println(targetArr.contentToString()) // [null, null, null, l, i, n]

    sourceArr.copyInto(targetArr, startIndex = 0, endIndex = 2)
    println(targetArr.contentToString()) // [k, o, null, l, i, n]
}