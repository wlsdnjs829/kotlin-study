package com.example.kotlin.kotlin_in_action_6

fun main() {
    var email: String?= "olo_jinwon@naver.com";
    email?.let { email -> sendEmailTo(email) }

    email = null
    email?.let { email -> sendEmailTo(email) }

}

fun sendEmailTo(email: String) {
    println("${email}에게 이메일 보내는 중")
}

