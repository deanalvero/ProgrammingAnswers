package com.deanalvero.answers.leetcode.easy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveOutermostParenthesesTest {

    private RemoveOutermostParentheses testee;

    @Before
    public void setUp() {
        testee = new RemoveOutermostParentheses();
    }

    @Test
    public void removeOuterParentheses_inputExampleOne_returnCorrectOutput() {
        String expected = "()()()";

        String actual = testee.removeOuterParentheses(
                "(()())(())"
        );

        assertEquals(expected, actual);
    }

    @Test
    public void removeOuterParentheses_inputExampleTwo_returnCorrectOutput() {
        String expected = "()()()()(())";

        String actual = testee.removeOuterParentheses(
                "(()())(())(()(()))"
        );

        assertEquals(expected, actual);
    }

    @Test
    public void removeOuterParentheses_inputExampleThree_returnCorrectOutput() {
        String expected = "";

        String actual = testee.removeOuterParentheses(
                "()()"
        );

        assertEquals(expected, actual);
    }
}
