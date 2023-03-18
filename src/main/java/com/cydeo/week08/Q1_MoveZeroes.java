package com.cydeo.week08;

import java.util.Arrays;

public class Q1_MoveZeroes {

    public static void main(String[] args) {

        int [] i = new int[] {2, 6, 0, 0, 3};
        int [] i2 = new int[] {0};
        int [] i3 = new int[] {0,0,0,6, 2, 3, 5, 7, 0};
        int [] i4 = new int[] {0, 0, 5, 6, 7, 77, 0, 0};
        int [] i5 = new int[] {5, 3, 7, 0, 0 };
        System.out.println(Arrays.toString(shiftZeroToRight_Sopo(i)));
        System.out.println(Arrays.toString(shiftZeroToRight_Sopo(i2)));
        System.out.println(Arrays.toString(shiftZeroToRight_Sopo(i3)));
        System.out.println(Arrays.toString(shiftZeroToRight_Sopo(i4)));
        System.out.println(Arrays.toString(shiftZeroToRight_Sopo(i5)));

        System.out.println("------------------------------------------");

        System.out.println(Arrays.toString(moveZeros(i)));


    }

    public static int [] shiftZeroToRight_Sopo (int [] a){
        if (a.length==1){
            return a;
        }
        Arrays.sort(a); //Sorting Array

        int newArray [] = new int[a.length]; //Declaring new array with specific length

        int count = 0; //index count
        for (int each:a){
            if (each !=0){ //if doesn't equal to 0 add to count.
                newArray [count] = each;
                count++;
            }
        }
            return newArray;
    }

    public static int[] moveZeros (int [] arr){

        int n = arr.length;
        int i = 0; //pointer for non-zero elements
        int j = 0; //pointer for all elements

        Arrays.sort(arr);

        while (j<n){
            if (arr[j] !=0){
                //swap the current element with the element at the i-th position

                int temp = arr[i];
                arr[i] = arr[j];
                arr [j] = temp;

                i++; //move the i-th pointer forward
            }

            j++; //move the j-th pointer forward
        }

        return arr;
    }

}
