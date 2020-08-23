package com.deanalvero.answers.leetcode.medium;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValidateBinarySearchTreeTest {

    private ValidateBinarySearchTree testee;

    @Before
    public void setUp() {
        testee = new ValidateBinarySearchTree();
    }

    @Test
    public void isValidBST_inputExampleOne_returnCorrectOutput() {
        boolean expected = true;

        ValidateBinarySearchTree.TreeNode root = new ValidateBinarySearchTree.TreeNode(2);
        root.left = new ValidateBinarySearchTree.TreeNode(1);
        root.right = new ValidateBinarySearchTree.TreeNode(3);

        boolean actual = testee.isValidBST(root);
        assertEquals(expected, actual);
    }


    @Test
    public void isValidBST_inputExampleTwo_returnCorrectOutput() {
        boolean expected = false;

        ValidateBinarySearchTree.TreeNode root = new ValidateBinarySearchTree.TreeNode(5);
        ValidateBinarySearchTree.TreeNode left = new ValidateBinarySearchTree.TreeNode(1);
        ValidateBinarySearchTree.TreeNode right = new ValidateBinarySearchTree.TreeNode(4);

        root.left = left;
        root.right = right;

        right.left = new ValidateBinarySearchTree.TreeNode(3);
        right.right = new ValidateBinarySearchTree.TreeNode(6);

        boolean actual = testee.isValidBST(root);
        assertEquals(expected, actual);
    }
}
