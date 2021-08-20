package com.deanalvero.kotlin.answers.leetcode.easy

class ReverseLinkedList {
    data class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

    fun reverseList(head: ListNode?): ListNode? {
        return traverse(head, null)
    }

    private fun traverse(head: ListNode?, prev: ListNode?): ListNode? {
        if (head == null) {
            return prev
        }
        val next = head.next
        head.next = prev
        return traverse(head = next, prev = head)
    }
}
