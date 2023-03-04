package com.cydeo.week07;

import java.util.Arrays;

public class Assignment1_TwoSum_InterviewSolution {

    public static void main(String[] args) {
        int [] array = new int [] {4, 7, 2, 11};


        System.out.println(Arrays.toString(twoSumSolution(array,4)));
    }

    //Why static class? I don't want to create a class, we don't need to create object, I will not have different instances of this class.
    public static int [] twoSumSolution (int [] array, int targetValue) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {

                if (i != j) {
                    if (array[i] + array[j] == targetValue)
                        return new int[]{i, j};
                }
            }
        }


        return new int[] {};
    }
}
