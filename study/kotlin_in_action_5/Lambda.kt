package com.example.kotlin.kotlin_in_action_5

fun salute() = println("Salute!")

fun main() {
    val person = Person("진원", 28)
    val bound = person::name
    println(bound.get())
}

fun constructDelay() {
    val createPerson = ::Person
    val person = createPerson("진원", 28)
    println(person)
}

fun Person.isAdult() = age >= 21

fun max() {
    val people = listOf(Person("진원", 28), Person("젊은 진원", 18))
    println(people.maxByOrNull(Person::age))
}

fun lambdaJoinToString() {
    val people = listOf(Person("진원", 28), Person("젊은 진원", 18))
    println(people.joinToString(" ") { it.name })
}

fun lambdaVal() {
    val sum = { x: Int, y: Int -> x + y }
    println(sum(1, 2))
}

data class Person(val name: String, val age: Int)

fun printMessagesWithPrefix(messages: Collection<String>, prefix: String) {
    messages.forEach {
        println("$prefix $it")
    }
}

fun printProblemCounts(responses: Collection<String>) {
    var clientErrors = 0
    var serverErrors = 0

    responses.forEach {
        if (it.startsWith("4")) clientErrors++
        if (it.startsWith("5")) serverErrors++
    }

    println("$clientErrors client errors, $serverErrors server errors")
}


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