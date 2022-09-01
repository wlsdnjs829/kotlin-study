package com.example.kotlin.kotlin_in_action_3

fun main() {
    val user = User(1, "이름", "주소")
}

class KotlinRefactor {

    private fun User.validateBeforeSave() {
        fun validate(value: String, fieldName: String) {
            if (value.isEmpty()) {
                throw IllegalArgumentException("사용자를 저장 할 수 없다. ${id}: 빈 $fieldName")
            }
        }

        validate(name, "이름")
        validate(address, "주소")
    }

    fun saveUser(user: User) {
        user.validateBeforeSave();
    }

}

class User(val id: Int, _name: String, val address: String) {

    var name: String = _name
    private set

}

open class NoArgs

class Hi : NoArgs()