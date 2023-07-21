package com.claydcomer.dsa.algorithm;

public class CountingSort extends IntegerArraySortAlgorithm {

    public CountingSort() {
        super(new int[]{2, 5, 9, 8, 2, 8, 7, 10, 4, 3});
    }

    @Override
    public void sort() {
        countingSort(integersToSort, 1, 10);
    }

    private void countingSort(int[] arr, int min, int max) {
        int[] countArray = new int[(max - min) + 1];

        for (int i : arr) {
            countArray[i - min]++;
        }

        int j = 0;
        for(int i = min; i < max; i++) {
            while(countArray[i - min] > 0) {
                arr[j++] = i;
                countArray[i - min]--;
            }
        }
    }
}
