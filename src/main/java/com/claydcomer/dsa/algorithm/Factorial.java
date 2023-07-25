package com.claydcomer.dsa.algorithm;

import lombok.AllArgsConstructor;

/**
 * 1! = 1 * 0! = 1
 * 2! = 2 * 1 = 2 * 1!
 * 3! = 3 * 2 * 1 = 3 * 2!
 * 4! = 4 * 3 * 2 * 1 = 4 * 3!
 *
 * n! = n * (n - 1)!
 */
@AllArgsConstructor
public class Factorial {

    private int num;

    public int calculateFactorialIteratively(int num) {
        if(num ==0) {
            return 1;
        }

        int factorial = 1;

        for(int i = 1; i < num; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public int calculateFactorialRecursively(int num) {
        if(num == 0) {
            return 1;
        }

        return num * calculateFactorialRecursively(num - 1);
    }
}
