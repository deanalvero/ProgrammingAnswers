package com.deanalvero.answers.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    static class LRUNode {
        LRUNode prev;
        LRUNode next;
        int value;
        int key;
    }

    Map<Integer, LRUNode> map;
    int capacity;
    LRUNode head, tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();

        head = new LRUNode();
        tail = new LRUNode();

        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        LRUNode node = map.get(key);
        if (node == null) {
            return -1;
        }

        removeNode(node);
        addNode(node);

        return node.value;
    }

    private void removeNode(LRUNode node) {
        LRUNode prev = node.prev;
        LRUNode next = node.next;

        prev.next = next;
        next.prev = prev;
    }

    private void addNode(LRUNode node) {
        LRUNode next = head.next;

        node.next = next;
        node.prev = head;

        next.prev = node;
        head.next = node;
    }

    public void put(int key, int value) {
        LRUNode node = map.get(key);

        if (node == null) {
            node = new LRUNode();
            node.value = value;
            node.key = key;

            map.put(key, node);
            addNode(node);

            if (map.size() > capacity) {
                LRUNode old = tail.prev;

                map.remove(old.key);


                removeNode(old);

            }
        } else {
            node.value = value;
            removeNode(node);
            addNode(node);
        }
    }

}
