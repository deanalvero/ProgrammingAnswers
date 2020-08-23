package com.deanalvero.answers.leetcode.medium;

public class RotateList {

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return null;
        }

        ListNode tail = head;
        int count = 1;
        while (tail.next != null) {
            count++;
            tail = tail.next;
        }
        tail.next = head;

        tail = head;
        for (int i = count - (k % count); i > 1; i--) {
            tail = tail.next;
        }

        head = tail.next;
        tail.next = null;

        return head;
    }
}
