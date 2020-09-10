package com.deanalvero.kotlin.answers.leetcode.medium

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class NumberOfIslandsTest {
    private lateinit var testee: NumberOfIslands

    @Before
    fun setUp() {
        testee = NumberOfIslands()
    }

    @Test
    fun numIslands_inputExampleOne_returnCorrectOutput() {
        val expected = 1
        val actual = testee.numIslands(
            arrayOf(
                charArrayOf('1','1','1','1','0'),
                charArrayOf('1','1','0','1','0'),
                charArrayOf('1','1','0','0','0'),
                charArrayOf('0','0','0','0','0')
            )
        )
        Assert.assertEquals(expected, actual)
    }


    @Test
    fun numIslands_inputExampleTwo_returnCorrectOutput() {
        val expected = 3
        val actual = testee.numIslands(
            arrayOf(
                charArrayOf('1','1','0','0','0'),
                charArrayOf('1','1','0','0','0'),
                charArrayOf('0','0','1','0','0'),
                charArrayOf('0','0','0','1','1')
            )
        )
        Assert.assertEquals(expected, actual)
    }

}