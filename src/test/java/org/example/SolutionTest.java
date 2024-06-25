package org.example;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void backspaceCompareTest() {
        Solution solution = new Solution();
        Assert.assertTrue(solution.backspaceCompare("ab#c", "ad#c"));
        Assert.assertTrue(solution.backspaceCompare("ab##", "c#d#"));
        Assert.assertFalse(solution.backspaceCompare("a#c", "b"));
    }

}