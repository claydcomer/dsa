package com.claydcomer.dsa.datastructure;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Array {

    //String array, where the values are stored as object references in memory
    private String[] stringArray;

    //int array, where the values of this primitive type are stored in memory
    private int[] integerArray;

    public Array() {
        stringArray = new String[3];
        integerArray = new int[10];

        populateDefaultArrayValues();
    }

    public Array(String[] stringArray) {
        this.stringArray = stringArray;
    }

    public Array(int[] integerArray) {
        this.integerArray = integerArray;
    }

    private void populateDefaultArrayValues() {
        stringArray[0] = "foo";
        stringArray[1] = "bar";
        stringArray[2] = "baz";

        integerArray[0] = 10;
        integerArray[1] = 20;
        integerArray[2] = 30;
        integerArray[3] = 40;
        integerArray[4] = 50;
        integerArray[5] = 60;
        integerArray[6] = 70;
        integerArray[7] = 80;
        integerArray[8] = 90;
        integerArray[9] = 100;
    }
}
