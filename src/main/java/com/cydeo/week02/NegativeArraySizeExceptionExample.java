package com.cydeo.week02;

public class NegativeArraySizeExceptionExample {
    public static void main(String[] args) {


        try {
            int[] array = new int[-7];
            System.out.println("Array length: " + array.length);

        }catch (Exception e) {
            System.out.println("Array length should be a positive number");

        }


        try {
            int[] array = new int[0];
            System.out.println("Array length: " + array.length);

        }catch (Exception e) {
            e.printStackTrace();

        }

        System.out.println("--------------------------------------------------------------");

    }

}
