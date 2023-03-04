package com.cydeo.week07;

import java.util.Arrays;

public class Q2_TwoSum {
    public static void main(String[] args) {

        int [] num = {3, 5, 7, 1, 2, 4};

        System.out.println(Arrays.toString(sum_Sopo(num, 5)));
        System.out.println(Arrays.toString(sum_Sopo(num, 0)));
    }
    public static int [] sum_Sopo (int [] num, int target) {
        Arrays.sort(num);
        int left = 0;
        int right = num.length-1;


        while (left<right){

            int sum = num[left]+num[right];

            if (sum==target){
                return new int[] {left, right}; //key and value
            }else if (sum<target) {
                left++; //starts checking from next index
            }else {
                right--; //coming down one by one until match;
            }
        }
        return new int[] {}; //if the match isn't found returns empty array
    }


}
