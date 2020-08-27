package com.deanalvero.kotlin.answers.leetcode.medium

import java.util.Queue
import java.util.LinkedList

class RottingOranges {
    fun orangesRotting(grid: Array<IntArray>): Int {
        var result = 0
        var freshCount = 0

        val queue: Queue<IntArray> = LinkedList<IntArray>()
        for (i in grid.indices) {
            for (j in grid[i].indices) {
                when (grid[i][j]) {
                    1 -> freshCount++
                    2 -> queue.offer(intArrayOf(i, j))
                }
            }
        }
        if (freshCount == 0) {
            return 0
        }

        val directions = arrayOf(intArrayOf(1,0), intArrayOf(-1,0), intArrayOf(0,1), intArrayOf(0,-1))
        while(!queue.isEmpty()) {
            result++
            val rottenCount = queue.size
            for (i in 1..rottenCount) {

                val rottenCell = queue.poll()

                for (direction in directions) {
                    val x = rottenCell[0] + direction[0]
                    val y = rottenCell[1] + direction[1]

                    if (x < 0 || y <0 || x == grid.size || y == grid[0].size) {
                        continue
                    }

                    if (grid[x][y] == 1) {
                        grid[x][y] = 2
                        queue.offer(intArrayOf(x, y))
                        freshCount--
                    }

                }
            }
        }

        return when(freshCount) {
            0 -> result - 1
            else -> -1
        }
    }
}