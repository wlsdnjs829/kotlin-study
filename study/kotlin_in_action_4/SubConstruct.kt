package com.example.kotlin.kotlin_in_action_4

import javax.print.attribute.AttributeSet
import org.springframework.web.servlet.function.ServerResponse

fun main() {
}

open class SubConstruct {

    constructor(ctx: ServerResponse.Context) {

    }

    constructor(ctx: ServerResponse.Context, attr: AttributeSet) {

    }

}

class MyButton(ctx: ServerResponse.Context, attr: AttributeSet) : SubConstruct(ctx, attr) {

}