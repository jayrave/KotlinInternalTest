package com.jayrave.kotlininternaltest


internal class InternalClass(val message: String) {

    fun printMessage() {
        System.out.print("From internal class: $message")
    }
}