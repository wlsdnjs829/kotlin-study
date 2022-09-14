package com.example.kotlin.small_seminar

class `2_코틀린 기본문법` {

    /**
     * 여기서 반환 타입을 생략할 수 있는 이유는 코틀린은 정적 타입 지정 언어이므로 컴파일 시점에 모든 식의 타입을 자동으로 지정해준다.
     * 즉, 타입 추론이 가능하다. 하지만 **실무에서는 타입을 지정하는 게 가독성이 좋지 않을까 싶다.
     */
    fun max(a: Int, b: Int): Int {
        return if (a > b) a else b
    }

    val title = "jinwon";
    var answer: Int = 42;

    fun print(a: Int, b: Int) {
        println("max value = ${if (a > b) a else "jinwon"}")
        println("max value = $a 이다")
    }

    enum class Color(
        private val r: Int, private val g: Int, private val b: Int
    ) {
        RED(255, 0, 0),
        ORANGE(255, 165, 0),
        YELLOW(255, 255, 0),
        GREEN(0, 255, 0),
        BLUE(0, 0, 255),
        INDIGO(75, 0, 130),
        VIOLET(238, 130, 238);

        fun rgb() = (r * 256 + g) * 256 + b
    }

    fun getKorean(color: Color) =
        when (color) {
            Color.BLUE -> "파란색"
            Color.RED -> "빨간색"
            Color.GREEN -> "초록색"
            Color.ORANGE -> "주황색"
            Color.YELLOW -> "노란색"
            Color.INDIGO -> "인디고"
            Color.VIOLET -> "보라색"
        }

    fun getKorean(color: Color, color2: Color) =
        when (setOf(color, color2)) {
            setOf(Color.YELLOW, Color.ORANGE) -> ""
            setOf(Color.GREEN, Color.RED) -> ""
            setOf(Color.BLUE, Color.VIOLET) -> ""
            setOf(Color.BLUE, Color.INDIGO) -> ""
            else -> "몰라"
        }

    fun getKoreans(color: Color, color2: Color) =
        when {
            Color.YELLOW == color && Color.ORANGE == color2 -> ""
            Color.GREEN == color && Color.RED == color2 -> ""
            else -> "몰라"
        }

}

