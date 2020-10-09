package com.deanalvero.java.answers.leetcode.medium;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class GroupThePeopleGivenTheGroupSizeTheyBelongToTest {

    private GroupThePeopleGivenTheGroupSizeTheyBelongTo testee;

    @Before
    public void setUp() {
        testee = new GroupThePeopleGivenTheGroupSizeTheyBelongTo();
    }

    @Test
    public void groupThePeople_inputExampleOne_returnCorrectOutput() {
        int[][] expected = new int[][]{
                new int[] {5},
                new int[] {0, 1, 2},
                new int[] {3, 4, 6}
        };

        List<List<Integer>> actualList = testee.groupThePeople(
                new int[] {
                        3, 3, 3, 3, 3, 1, 3
                });
        int[][] actual = format(actualList);

        sort(expected);
        sort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void groupThePeople_inputExampleTwo_returnCorrectOutput() {
        int[][] expected = new int[][]{
                new int[] {1},
                new int[] {0, 5},
                new int[] {2, 3, 4}
        };

        List<List<Integer>> actualList = testee.groupThePeople(
                new int[] {
                        2, 1, 3, 3, 3, 2
                });
        int[][] actual = format(actualList);

        sort(expected);
        sort(actual);
        assertArrayEquals(expected, actual);
    }

    private int[][] format(List<List<Integer>> items) {
        int[][] result = new int[items.size()][];
        for (int i = 0; i < items.size(); i++) {
            List<Integer> item = items.get(i);
            result[i] = new int[item.size()];

            for (int j = 0; j < item.size(); j++) {
                result[i][j] = item.get(j);
            }
        }
        return result;
    }

    private void sort(int[][] arrays) {
        for (int[] array : arrays) {
            Arrays.sort(array);
        }

        Arrays.sort(arrays, (t1, t2) -> {
            String t1String = Arrays.toString(t1);
            String t2String = Arrays.toString(t2);
            return t1String.compareTo(t2String);
        });
    }
}
