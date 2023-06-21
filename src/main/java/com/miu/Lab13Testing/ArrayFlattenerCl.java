package com.miu.Lab13Testing;

import java.util.ArrayList;
import java.util.List;

public class ArrayFlattenerCl {
    public int[] flattenArrayCl(int[][] input) {
        if (input == null) {
            return null;
        }

        List<Integer> flattenedList = new ArrayList<>();

        for (int[] innerArray : input) {
            for (int num : innerArray) {
                flattenedList.add(num);
            }
        }

        int[] flattenedArray = new int[flattenedList.size()];
        for (int i = 0; i < flattenedList.size(); i++) {
            flattenedArray[i] = flattenedList.get(i);
        }

        return flattenedArray;
    }
}

