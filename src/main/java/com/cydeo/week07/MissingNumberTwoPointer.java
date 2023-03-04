package com.cydeo.week07;

import java.util.Arrays;

public class MissingNumberTwoPointer {
    public static void main(String[] args) {

        int [] num = {4, 5, 2, 1, 0 };
        System.out.println(twoPointer(num));

    }
    static int twoPointer(int[] nums) { //binary search
        Arrays.sort(nums);
        int left = 0, right = nums.length, mid;
        while (left < right) {
            mid = (left + right) / 2;
            if (nums[mid] > mid)
                right = mid;
            else
                left = mid + 1;
        }
        return left;
    }

}
