package com.claydcomer.dsa.algorithm;

public class RadixSort extends IntegerArraySortAlgorithm {

    public RadixSort() {
        super(new int[]{4725, 4586, 1330, 8792, 1594, 5729});
    }

    @Override
    public void sort() {
        radixSort(integersToSort, 10, 4);
    }

    private void radixSort(int[] array, int radix, int width) {
        for(int i = 0; i < width; i++) {
            radixSingleSort(array, i, radix);
        }
    }

    private void radixSingleSort(int[] array, int position, int radix) {
        int numItems = array.length;
        int[] countArray = new int[radix];

        for(int value: array) {
            countArray[getDigit(position, value, radix)]++;
        }

        //Adjust the count array
        for(int j = 1; j < radix; j++) {
            countArray[j] += countArray[j - 1];
        }

        int[] temp = new int[numItems];

        for(int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--) {
            temp[--countArray[getDigit(position, array[tempIndex], radix)]] = array[tempIndex];
        }

        System.arraycopy(temp, 0, array, 0, numItems);
    }

    private int getDigit(int position, int value, int radix) {
        return value / (int) Math.pow(10, position) % radix;
    }
}
