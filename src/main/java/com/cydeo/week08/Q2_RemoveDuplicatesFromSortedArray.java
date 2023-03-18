package com.cydeo.week08;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Q2_RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {

        Integer [] arr1 = new Integer[] {3, 3, 5, 5, 0, 1};
        Integer [] arr2 = new Integer[] {0, 0, 9, 8, 5, 5, 6, 6, 7, 7};
        Integer [] arr3 = new Integer[] {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        setWithoutDuplicates_Sopo(arr1);
        setWithoutDuplicates_Sopo(arr2);
        setWithoutDuplicates_Sopo(arr3);




    }
    public static void setWithoutDuplicates_Sopo (Integer arr []){

        HashSet <Integer> setWithoutDuplicates = new HashSet<>(); //sorts and removes duplicates

        for (int i = 0; i < arr.length; i++) {
            setWithoutDuplicates.add(arr[i]); //adding all elements in HashSet from arr
        }

        int count =  setWithoutDuplicates.size(); //counting size of HashSet

        System.out.println("K = "+count+ " nums = "+setWithoutDuplicates);
    }
}
