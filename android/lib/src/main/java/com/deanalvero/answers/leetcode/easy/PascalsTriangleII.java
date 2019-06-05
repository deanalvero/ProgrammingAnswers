package com.deanalvero.answers.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();

        int length = rowIndex+1;

        int[] temp = new int[length];
        temp[0] = 1;

        int[] innerTemp;
        for (int i = 0; i < length; i++) {

            innerTemp = new int[i+1];
            for (int j = 0; j < i+1; j++) {
                innerTemp[j] = getNum(temp, i, j - 1) + getNum(temp, i, j);
            }


            for (int j = 0; j < innerTemp.length; j++) {
                temp[j] = innerTemp[j];
            }
        }

        for (int i = 0; i < length; i++) {
            result.add(temp[i]);
        }

        return result;
    }

    private int getNum(int[] storage, int x, int y) {
        if (x < 0
                || y < 0
                || y > x
        ) {
            return 0;
        }
        return storage[y];
    }
}
