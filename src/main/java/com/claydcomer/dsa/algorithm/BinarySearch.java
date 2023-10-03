package com.claydcomer.dsa.algorithm;

import lombok.Getter;

@Getter
public class BinarySearch {

    private final int[] intArray;

    public BinarySearch() {
        intArray = new int[]{-22, -15, 1, 7, 20, 35, 55};
    }

    public int iterativeSearch(int searchValue) {
        int start = 0;
        int end = intArray.length;

        while(start < end) {
            int mid = (start + end)/2;

            if(intArray[mid] == searchValue) {
                return mid;
            } else if(intArray[mid] < searchValue) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return -1;
    }

    public int recursiveSearch(int searchValue) {
        return recursiveSearch(intArray, 0, intArray.length, searchValue);
    }

    private int recursiveSearch(int[] intArray, int start, int end, int searchValue) {
        if(start >= end) {
            return -1;
        }

        int mid = (start + end) / 2;

        if(intArray[mid] == searchValue) {
            return mid;
        } else if(intArray[mid] < searchValue) {
            return recursiveSearch(intArray, mid + 1, end, searchValue);
        } else {
            return recursiveSearch(intArray, start, mid, searchValue);
        }
    }
}
