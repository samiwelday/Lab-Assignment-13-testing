package com.miu.Lab13Testing;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;

public class ArrayFlattenerClTest {

    @Test
    public void testFlattenArrayCl() {
        ArrayFlattenerCl arrayFlattener = new ArrayFlattenerCl();
        int[][] input = {{1, 3}, {0}, {4, 5, 9}};
        int[] expectedOutput = {1, 3, 0, 4, 5, 9};
        int[] result = arrayFlattener.flattenArrayCl(input);
        assertArrayEquals(expectedOutput, result);
    }

    @Test
    public void testFlattenArrayClWithNullInput() {
        ArrayFlattenerCl arrayFlattener = new ArrayFlattenerCl();
        int[][] input = null;
        int[] result = arrayFlattener.flattenArrayCl(input);
        assertNull(result);
    }
}
