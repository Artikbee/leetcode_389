package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;


class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void findTheDifferenceTest() {

        assertEquals("e", solution.findTheDifference("abcd", "abcde"));

    }

}