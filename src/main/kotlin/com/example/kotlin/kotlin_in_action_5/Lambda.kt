package com.example.kotlin.kotlin_in_action_5

fun main() {
    lambdaJoinToString()
}

fun max() {
    val people = listOf(Person("진원", 28), Person("젊은 진원", 18))
    println(people.maxByOrNull(Person::age))
}

fun lambdaJoinToString() {
    val people = listOf(Person("진원", 28), Person("젊은 진원", 18))
    println(people.joinToString(" ") { it.name } )
}

fun lambdaVal() {
    val sum = { x: Int, y: Int -> x + y }
    println(sum(1, 2))
}

data class Person(val name: String, val age: Int)

/*

// 무명 내부 클래스
button.setOnClickLister(new OnClickListener() {

    @Override
    public void onClick(View view) {
        /* 클릭 시 수행할 동작 */
    }

}

// 람다
button.setOnClickLister { /* 클릭 시 수행할 동작 */ }

*/