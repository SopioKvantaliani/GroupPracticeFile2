package com.cydeo.week02;

import java.util.Arrays;

public class ManipulateArray {

    public static void main(String[] args) {
        String [] myArray = new String[3];
        int k =0;

        for (String each:myArray) {
            myArray  [k++]="I am a DJR";
        }

        System.out.println(Arrays.toString(myArray));


    }
}

