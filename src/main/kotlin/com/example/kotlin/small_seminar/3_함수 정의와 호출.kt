package com.example.kotlin.small_seminar

class `3_함수 정의와 호출` {

    fun main() {
        val arrayListOf: ArrayList<*> = arrayListOf(1, 7, 53)
        println(arrayListOf.joinToStringThree(", ", "(", ")") { it.toString() })
    }

    fun <T> Collection<T>.joinToStringThree(
        separator: String,
        prefix: String,
        postfix: String,
        transform: ((T) -> String)? = null
    ): String {
        val result = StringBuilder(prefix)

        for ((index, element) in this.withIndex()) {
            if (index > 0) result.append(separator)
            result.append(transform?.invoke(element) ?: element.toString())
        }

        result.append(postfix)
        return result.toString()
    }

    fun String.lastChar() : Char = this[this.length - 1]

    fun getNameLastChar() {
        println("JINWON".lastChar())
    }

    class KotlinRefactor {

        class User(val id: Int, _name: String, val address: String) {
            var name: String = _name
                private set
        }

        fun duplicate(user: User) {
            if (user.name.isEmpty()) {
                throw IllegalArgumentException("사용자를 저장 할 수 없다. ${user.name}: 빈 사용자 이름")
            }

            if (user.address.isEmpty()) {
                throw IllegalArgumentException("사용자를 저장 할 수 없다. ${user.address}: 빈 주소")
            }
        }

    }

}

