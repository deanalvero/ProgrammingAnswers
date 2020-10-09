package com.deanalvero.java.answers.leetcode.medium;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeepestLeavesSumTest {
    private DeepestLeavesSum testee;

    @Before
    public void setUp() {
        testee = new DeepestLeavesSum();
    }

    @Test
    public void deepestLeavesSum_defaultExample_returnCorrectOutput() {
        int expected = 15;

        DeepestLeavesSum.TreeNode node = new DeepestLeavesSum.TreeNode(
                1,
                new DeepestLeavesSum.TreeNode(
                        2,
                        new DeepestLeavesSum.TreeNode(
                                4,
                                new DeepestLeavesSum.TreeNode(7),
                                null
                        ),
                        new DeepestLeavesSum.TreeNode(5)
                ),
                new DeepestLeavesSum.TreeNode(
                        3,
                        new DeepestLeavesSum.TreeNode(),
                        new DeepestLeavesSum.TreeNode(
                                6,
                                new DeepestLeavesSum.TreeNode(),
                                new DeepestLeavesSum.TreeNode(8)
                        )
                )
        );

        int actual = testee.deepestLeavesSum(node);
        assertEquals(expected, actual);
    }

}
