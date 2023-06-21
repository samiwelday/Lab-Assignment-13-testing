package com.miu.Lab13Testing;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayReversorClTest {

    @Test
    public void testReverseArrayCl() {
        ArrayReversorCl arrayReversor = new ArrayReversorCl();

        int[][] input = {{1, 3}, {0}, {4, 5, 9}};
        int[] reversedArray = {9, 5, 4, 0, 3, 1};

        int[] result = arrayReversor.reverseArray(input);
        assertArrayEquals(reversedArray, result);
    }

    @Test
    public void testReverseArrayClWithNullInput() {
        ArrayReversorCl arrayReversorCl = new ArrayReversorCl();

        int[][] input = null;

        int[] result = arrayReversorCl.reverseArray(input);
        assertNull(result);
    }
}
