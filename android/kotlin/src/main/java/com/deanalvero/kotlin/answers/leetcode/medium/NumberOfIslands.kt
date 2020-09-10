package com.deanalvero.kotlin.answers.leetcode.medium

class NumberOfIslands {
    fun numIslands(grid: Array<CharArray>): Int {
        var result = 0
        for (i in grid.indices) {
            for (j in grid[i].indices) {
                if (grid[i][j] == '1') {
                    result++
                    resolveLand(grid, i, j)
                }
            }
        }
        return result
    }

    fun resolveLand(grid: Array<CharArray>, x: Int, y: Int) {
        if (x < 0 || y < 0 || x == grid.size || y == grid[0].size) {
            return
        }

        if (grid[x][y] == '1') {
            grid[x][y] = '0'
            resolveLand(grid, x - 1, y)
            resolveLand(grid, x + 1, y)
            resolveLand(grid, x, y - 1)
            resolveLand(grid, x, y + 1)
        }
    }
}