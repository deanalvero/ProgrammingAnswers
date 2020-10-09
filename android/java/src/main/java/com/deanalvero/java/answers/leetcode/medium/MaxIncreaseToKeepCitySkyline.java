package com.deanalvero.java.answers.leetcode.medium;

/**
 * Max Increase to Keep City Skyline
 */
public class MaxIncreaseToKeepCitySkyline {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int result = 0;
        int rowLength = grid.length;
        int colLength = grid[0].length;

        int[] maxRow = new int[rowLength];
        int[] maxCol = new int[colLength];

        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                maxRow[i] = Math.max(maxRow[i], grid[i][j]);
                maxCol[j] = Math.max(maxCol[j], grid[i][j]);
            }
        }

        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                result += Math.min(maxRow[i], maxCol[j]) - grid[i][j];
            }
        }
        return result;
    }
}
