package com.miu.Lab13Testing;

public class ArrayReversorCl {
    public int[] reverseArray(int[][] input) {
        if (input == null) {
            return null;
        }

        int flattenedLength = 0;
        for (int[] array : input) {
            flattenedLength += array.length;
        }

        int[] flattenedArray = new int[flattenedLength];
        int index = 0;
        for (int[] array : input) {
            for (int element : array) {
                flattenedArray[index++] = element;
            }
        }

        int[] reversedArray = new int[flattenedLength];
        for (int i = 0; i < flattenedLength; i++) {
            reversedArray[i] = flattenedArray[flattenedLength - 1 - i];
        }

        return reversedArray;
    }
}
