package com.example.kotlin.kotlin_in_action_5

/*
void postponeComputation(int delay, Runnable computation);

postponeComputation(1000) { println(42) }

postponeComputation(1000, object : Runnable {
    override fun run() {
        println(42)
    }
})

val runnable = Runnable { println(42) }

fun handleComputation() {
    postponeComputation(1000, runnable) // 모든 handleComputation 호출 시에는 같은 객체를 사용한다. (람다의 재사용)
}

fun handleComputation(id: String) {
    postponeComputation(1000) { println(id) } // 람다 안에서 주변 영역의 변수를 포획한 경우, handleComputation 호출 시마다 새로운 객체를 생성하여 반환한다.
}
 */