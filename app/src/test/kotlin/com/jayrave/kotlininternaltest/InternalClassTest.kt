package com.jayrave.kotlininternaltest

import org.junit.Test

class InternalClassTest {

    @Test
    fun testInternalClassAccess() {
        InternalClass("This is a test")
        assert((1 + 1).equals(2))
    }
}