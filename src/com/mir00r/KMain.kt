package com.mir00r

/**
 * @project IntelliJ IDEA
 * @author mir00r on 8/10/22
 */


class KMain {
    private fun simple(x: Int): Int{
        return x * x
    }
    fun main() {
        for(count in 1..1000) {
            simple(count)
        }
        val seq = sequence { yieldAll(1..20) }.filter { it < 11 }
        println(seq)
    }
}
