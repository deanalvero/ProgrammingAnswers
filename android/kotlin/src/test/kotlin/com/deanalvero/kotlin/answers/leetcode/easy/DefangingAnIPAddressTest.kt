package com.deanalvero.kotlin.answers.leetcode.easy

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class DefangingAnIPAddressTest {

    lateinit var testee: DefangingAnIPAddress

    @Before
    fun setUp() {
        testee = DefangingAnIPAddress()
    }

    @Test
    fun defangIPaddr_inputExampleOne_returnCorrectOutput() {
        val expected = "1[.]1[.]1[.]1"
        val actual = testee.defangIPaddr(
                "1.1.1.1"
        )
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun defangIPaddr_inputExampleTwo_returnCorrectOutput() {
        val expected = "255[.]100[.]50[.]0"
        val actual = testee.defangIPaddr(
                "255.100.50.0"
        )
        Assert.assertEquals(expected, actual)
    }

}