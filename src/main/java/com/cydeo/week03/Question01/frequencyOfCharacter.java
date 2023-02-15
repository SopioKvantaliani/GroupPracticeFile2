package com.cydeo.week03.Question01;

public class frequencyOfCharacter {
    public static void main(String[] args) {
        String str = "aaabbbcccaaaaadddcccc";
        char ch = 'a';

        int count = 0;
        for (int i = 0; i < str.length(); i++) { //i: index numbers of str
        if (str.charAt(i)==ch){ //character of the string is equal to the given character, it means given character has appeared in the String.
            count++;
        }

        }
        System.out.println(count);


    }
}