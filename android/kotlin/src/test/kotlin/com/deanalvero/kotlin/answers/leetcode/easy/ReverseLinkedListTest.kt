package com.deanalvero.kotlin.answers.leetcode.easy

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class ReverseLinkedListTest {

    lateinit var testee: ReverseLinkedList

    @Before
    fun setUp() {
        testee = ReverseLinkedList()
    }

    @Test
    fun reverseList_inputExampleOne_returnCorrectOutput() {
        val expected = intArrayOf(5, 4, 3, 2, 1).toListNode()
        val actual = testee.reverseList(
            intArrayOf(1, 2, 3, 4, 5).toListNode()
        )
        assertEquals(expected, actual)
    }

    @Test
    fun reverseList_inputExampleTwo_returnCorrectOutput() {
        val expected = intArrayOf(1, 2).toListNode()
        val actual = testee.reverseList(
            intArrayOf(2, 1).toListNode()
        )
        assertEquals(expected, actual)
    }

    @Test
    fun reverseList_inputExampleThree_returnCorrectOutput() {
        val expected = intArrayOf().toListNode()
        val actual = testee.reverseList(
            intArrayOf().toListNode()
        )
        assertEquals(expected, actual)
    }

    private fun IntArray.toListNode(): ReverseLinkedList.ListNode? {
        if (isEmpty()) return null
        var node = ReverseLinkedList.ListNode(last())
        for (index in size - 2 downTo 0) {
            node = ReverseLinkedList.ListNode(get(index)).also {
                it.next = node
            }
        }
        return node
    }
}
