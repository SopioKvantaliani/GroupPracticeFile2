package com.cydeo.CollectionReview_InterviewAlgo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Assignment1_TwoSum_InterviewSolution {

        public static void main(String[] args) {
        int [] array = new int [] {4, 7, 2, 11};
        System.out.println(Arrays.toString(twoSumSolution(array,9)));

        System.out.println(Arrays.toString(twoSumOptimalSolution(array, 9)));
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

    public static int [] twoSumOptimalSolution (int [] array, int targetValue){
        //Time Complexity is O(n ), space complexity O(n);
        //create hashmap
        Map <Integer, Integer > map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int potentialMatch = targetValue-array[i];
            if (map.containsKey(potentialMatch) ){
                return new int[] {i, map.get(potentialMatch)}; //map.get(potentialMatch) returns value of match number;
            }else {
                map.put(array[i], i);
            }
        }
        return null;
    }
}
