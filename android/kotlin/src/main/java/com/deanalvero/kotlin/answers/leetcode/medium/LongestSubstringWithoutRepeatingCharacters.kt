package com.deanalvero.kotlin.answers.leetcode.medium

class LongestSubstringWithoutRepeatingCharacters {
    fun lengthOfLongestSubstring(s: String): Int {
        var result = 0
        var start = 0
        val set = mutableSetOf<Char>()

        for (i in s.indices) {
            if (set.contains(s[i])) {
                while (set.contains(s[i])) {
                    set.remove(s[start])
                    start++
                }
            }
            set.add(s[i])
            result = result.coerceAtLeast(set.size)

        }
        return result
    }
}