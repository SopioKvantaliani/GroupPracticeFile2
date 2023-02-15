package com.cydeo.week05;

public class Q1_FindMaxNumberInArray {

    public static void main(String[] args) {

        int [] number = {6, 7, 9, 30, -5, 0};
        FindMaxNumber(number);

    }

    public static int FindMaxNumber (int [] x){
        int num = 0;
        for (int each : x){
            if (each>num){
                num=each;
            }
        }
        System.out.println(num);

        return num;
    }
}
