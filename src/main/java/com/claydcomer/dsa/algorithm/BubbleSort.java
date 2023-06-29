package com.claydcomer.dsa.algorithm;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BubbleSort {

    private int[] integersToSort;

    public BubbleSort() {
        integersToSort = new int[]{20, 35, -15, 7, 55, 1, -22};
    }

    public void sort() {
        for(int lastUnsortedIndex = integersToSort.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for(int i = 0; i < lastUnsortedIndex; i++) {
                int j = i + 1;
                if (integersToSort[i] > integersToSort[j]) {
                    swap(integersToSort, i, j);
                }
            }
        }
    }

    public int[] getSorted() {
        return integersToSort;
    }

    private void swap(int[] array, int i, int j) {
        if(i != j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
