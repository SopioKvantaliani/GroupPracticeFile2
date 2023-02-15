package com.cydeo.week02;

public class StringReverse {
    public static void main(String[] args) {

        ReverseString("The sky is blue");

    }

    public static void ReverseString (String input){
        String reverse = "";
        String output []= input.split(" ");

        for (int i = 0; i < output.length; i++) {

            reverse = output[i]+" "+reverse;

        }

        System.out.println(reverse);
    }

    }
