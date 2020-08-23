package com.deanalvero.answers.leetcode.medium;

public class WordSearch {
    public boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (exist(board, word, visited, 0, i, j)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean exist(char[][] board, String word, boolean[][] visited, int index, int i, int j) {
        if (index == word.length()) {
            return true;
        }
        if (i == board.length || j == board[0].length || i < 0 || j < 0 || visited[i][j] || board[i][j] != word.charAt(index)) {
            return false;
        }
        visited[i][j] = true;
        if (exist(board, word, visited, index+1, i-1, j)
                || exist(board, word, visited, index+1, i+1, j)
                || exist(board, word, visited, index+1, i, j-1)
                || exist(board, word, visited, index+1, i, j+1)) {
            return true;
        }
        visited[i][j] = false;
        return false;
    }
}
