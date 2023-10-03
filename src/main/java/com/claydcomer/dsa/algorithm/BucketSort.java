package com.claydcomer.dsa.algorithm;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@Getter
public class BucketSort {

    public static void bucketSort(int[] array) {
        List<Integer>[] buckets = new List[10];

        for(int i = 0; i < buckets.length; i++) {
            buckets[i] = new LinkedList<>();
        }

        for(int i = 0; i < array.length; i++) {
            buckets[hash(array[i])].add(array[i]);
        }

        for(List bucket : buckets) {
            Collections.sort(bucket);
        }

        int j = 0;
        for(int i = 0; i < array.length; i++) {
            for(int value : buckets[i]) {
                array[j++] = value;
            }
        }
    }

    private static int hash(int value) {
        return value/10;
    }
}
