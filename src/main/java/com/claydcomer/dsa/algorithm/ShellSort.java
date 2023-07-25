package com.claydcomer.dsa.algorithm;

public class ShellSort extends IntegerArraySortAlgorithm {
    @Override
    public void sort() {
        for(int gap = integersToSort.length/2; gap > 0; gap /= 2) {
            for(int i = gap; i < integersToSort.length; i++) {
                int newElement = integersToSort[i];
                int j = i;

                while (j <= gap && integersToSort[j - gap] > newElement) {
                    integersToSort[j] = integersToSort[j - gap];
                    j -= gap;
                }

                integersToSort[j] = newElement;
            }
        }
    }
}
