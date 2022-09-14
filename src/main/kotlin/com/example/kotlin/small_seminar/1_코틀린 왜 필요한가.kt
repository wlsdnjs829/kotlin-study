package com.example.kotlin.small_seminar

class `1_코틀린 왜 필요한가` {
    val s: String? = null // nullable
//    val s2: String = null // not null

    fun any(value: Any) {
        if (value is String)
            value.uppercase()
    }

    data class Person(val name: String, // 데이터 클래스 정의
                      val age: Int? = null) // 널이 될 수 있는 타입 Int?

    fun maxByAge(args: Array<String>) { // 최상위 함수
        val persons = listOf(Person("예제"), Person("진원", age = 28)) // 이름 붙인 명시적인 파라미터
        val oldest = persons.maxByOrNull { it.age ?: 0 } // 람다 식과 엘비스 연산자
    }
}

