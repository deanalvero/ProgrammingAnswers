package com.deanalvero.java.answers.leetcode.medium;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumOfNodesWithEvenValuedGrandparentTest {
    private SumOfNodesWithEvenValuedGrandparent testee;

    @Before
    public void setUp() {
        testee = new SumOfNodesWithEvenValuedGrandparent();
    }

    @Test
    public void sumEvenGrandparent_defaultExample_returnCorrectOutput() {
        int expected = 18;
        int actual = testee.sumEvenGrandparent(
                new SumOfNodesWithEvenValuedGrandparent.TreeNode(
                       6,
                        new SumOfNodesWithEvenValuedGrandparent.TreeNode(
                                7,
                                new SumOfNodesWithEvenValuedGrandparent.TreeNode(
                                        2,
                                        new SumOfNodesWithEvenValuedGrandparent.TreeNode(9),
                                        null
                                ),
                                new SumOfNodesWithEvenValuedGrandparent.TreeNode(
                                        7,
                                        new SumOfNodesWithEvenValuedGrandparent.TreeNode(1),
                                        new SumOfNodesWithEvenValuedGrandparent.TreeNode(4)
                                )
                        ),
                        new SumOfNodesWithEvenValuedGrandparent.TreeNode(
                                8,
                                new SumOfNodesWithEvenValuedGrandparent.TreeNode(1),
                                new SumOfNodesWithEvenValuedGrandparent.TreeNode(
                                        3,
                                        null,
                                        new SumOfNodesWithEvenValuedGrandparent.TreeNode(5)
                                )
                        )
                )
        );
        assertEquals(expected, actual);
    }
}
