package com.cydeo.AlgoSolutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum_FromIntArray {

    public static void main(String[] args) {

       int [] nums = {2, 4, 7, 9};

        System.out.println(Arrays.toString(twoSum(nums, 1)));

    }
    public static int[] twoSum (int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[] {numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }
        return new int[] {};
    }
}
