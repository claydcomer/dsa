package com.claydcomer.dsa.algorithm;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@Getter
@AllArgsConstructor
public abstract class IntegerArraySortAlgorithm {

    protected int[] integersToSort;

    protected IntegerArraySortAlgorithm() {
        integersToSort = new int[]{20, 35, -15, 7, 55, 1, -22};
    }

    public abstract void sort();

    public void printIntegerArray() {
        System.out.println(Arrays.toString(integersToSort));
    }

    protected void swap(int[] array, int i, int j) {
        if(i != j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
