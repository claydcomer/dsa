package com.claydcomer.dsa.algorithm;

public class QuickSort extends IntegerArraySortAlgorithm {
    @Override
    public void sort() {
        quickSort(integersToSort, 0, integersToSort.length - 1);
    }

    private void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex - 1); // Left side of pivot
            quickSort(arr, pivotIndex + 1, high); // Right side of pivot
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for(int j = low; j <= high - 1; j++) {
            // If the current element is less than or equal to the pivot
            if(arr[j] < pivot) {
                // Move the temporary pivot index forward
                i++;
                // Swap the current element with the element at the temporary pivot index
                swap(arr, i, j);
            }
        }

        // Move the pivot element to the correct pivot position (between the smaller and larger elements)
        swap(arr, i + 1, high);
        return i + 1; // the pivot index
    }
}
