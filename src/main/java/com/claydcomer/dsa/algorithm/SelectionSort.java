package com.claydcomer.dsa.algorithm;

public class SelectionSort extends IntegerArraySortAlgorithm{

    public SelectionSort() {
        super();
    }

    public void sort() {
        for(int lastUnsortedIndex = integersToSort.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largestIndex = 0;

            for(int i = 1; i <= lastUnsortedIndex; i++) {
                if (integersToSort[i] > integersToSort[largestIndex]) {
                    largestIndex = i;
                }
            }

            swap(integersToSort, largestIndex, lastUnsortedIndex);
        }
    }
}
