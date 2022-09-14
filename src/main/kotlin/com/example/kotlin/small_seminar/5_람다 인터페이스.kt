package com.example.kotlin.small_seminar

class `5_람다 인터페이스` {

    fun alphabet(): String {
        val result = StringBuilder()

        for (letter in 'A'..'Z') {
            result.append(letter)
        }

        result.append("\nNow I know the alphabet!")
        return result.toString()
    }

}

