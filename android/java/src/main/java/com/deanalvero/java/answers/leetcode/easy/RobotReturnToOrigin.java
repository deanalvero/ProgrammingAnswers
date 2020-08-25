package com.deanalvero.java.answers.leetcode.easy;

public class RobotReturnToOrigin {
    public boolean judgeCircle(String moves) {
        char[] moveChars = moves.toCharArray();

        int x = 0;
        int y = 0;

        for (char moveChar: moveChars) {
            switch (moveChar) {
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;

                case 'R':
                    x++;
                    break;

                case 'L':
                    x--;
                    break;
            }
        }

        return x == 0 && y== 0;
    }
}
