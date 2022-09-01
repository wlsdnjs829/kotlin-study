package com.example.kotlin

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class KotlinTests : BehaviorSpec({

    given("계산기") {
        val a = 1
        val b = 2

        `when`("a와 b를 더하면") {
            val result = a + b

            then("3이 된다.") {
                result shouldBe 3
            }
        }

        `when`("a와 b를 빼면") {
            val result = a - b

            then("-1이 된다.") {
                result shouldBe -1
            }
        }

        `when`("a와 b를 곱하면") {
            val result = a * b

            then("2가 된다.") {
                result shouldBe 2
            }
        }
    }

})