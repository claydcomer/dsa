package com.claydcomer.dsa.algorithm;

public class InsertionSort extends IntegerArraySortAlgorithm {

    public InsertionSort() {
        super();
    }

    @Override
    public void sort() {
        for(int firstUnsortedIndex = 1; firstUnsortedIndex < integersToSort.length; firstUnsortedIndex++) {
            int newElement = integersToSort[firstUnsortedIndex];

            int i;

            for(i = firstUnsortedIndex; i > 0 && integersToSort[i - 1] > newElement; i--) {
                integersToSort[i] = integersToSort[i - 1];
            }

            integersToSort[i] = newElement;
        }
    }
}
