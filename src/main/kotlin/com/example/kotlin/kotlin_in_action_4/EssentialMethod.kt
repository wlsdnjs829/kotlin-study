package com.example.kotlin.kotlin_in_action_4

fun main() {
    val processed = hashSetOf(Client("이진원", 1234))
    println(processed.contains(Client("이진원", 1234)))
}

class Client(val name: String, val postalCode: Int) {

    override fun toString() = "Client(name='$name', postalCode=$postalCode)"

    override fun equals(other: Any?): Boolean { // Any는 Object와 대응하는 클래스다.
        if (this === other) return true // 참조 비교를 한다.
        if (other == null || other !is Client) return false // other가 Client 타입인지 검사한다

        return name == other.name &&
                postalCode == other.postalCode
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + postalCode
        return result
    }

}