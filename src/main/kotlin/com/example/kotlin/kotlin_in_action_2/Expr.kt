package com.example.kotlin.kotlin_in_action_2

sealed class Expr {
    class Num(val value: Int) : Expr()
    class Sum(val left: Expr, val right: Expr) : Expr()
}

fun eval(e: Expr): Int =
    when (e) {
        is Expr.Num -> e.value
        is Expr.Sum -> eval(e.left) + eval(e.right)
    }

//class Num(val value: Int) : Expr {
//    override fun eval(): Int = value
//}
//
//class Sum(val left: Expr, val right: Expr) : Expr {
//    override fun eval(): Int = cast(left) + cast(right)
//
//    private fun cast(expr: Expr): Int {
//        if (expr is Sum) {
//            return cast(expr.left) + cast(expr.right)
//        }
//
//        if (expr is Num) {
//            return expr.eval()
//        }
//
//        throw IllegalArgumentException()
//    }
//
//}