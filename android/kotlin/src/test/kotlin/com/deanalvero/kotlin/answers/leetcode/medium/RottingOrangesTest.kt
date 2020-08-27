package com.deanalvero.kotlin.answers.leetcode.medium

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class RottingOrangesTest {

    private lateinit var testee: RottingOranges

    @Before
    fun setUp() {
        testee = RottingOranges()
    }

    @Test
    fun orangesRotting_inputExampleOne_returnCorrectOutput() {
        val expected = 4
        val actual = testee.orangesRotting(
            arrayOf(
                intArrayOf(2, 1, 1),
                intArrayOf(1, 1, 0),
                intArrayOf(0, 1, 1)
            )
        )
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun orangesRotting_inputExampleTwo_returnCorrectOutput() {
        val expected = -1
        val actual = testee.orangesRotting(
            arrayOf(
                intArrayOf(2, 1, 1),
                intArrayOf(0, 1, 1),
                intArrayOf(1, 0, 1)
            )
        )
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun orangesRotting_inputExampleThree_returnCorrectOutput() {
        val expected = 0
        val actual = testee.orangesRotting(
            arrayOf(
                intArrayOf(0,2)
            )
        )
        Assert.assertEquals(expected, actual)
    }
}