package com.cydeo.week03.Question01;

import java.util.function.Consumer;

public class CheckRepeatedVowels {

    public static void main(String[] args) {

        String str = "Sophie";
        String str2 = "aeiou";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            for (int s = 0; s < str2.length(); s++) {

                int count = 0;
                if (character == str2.charAt(s)) {
                    count++;
                    if (count>1){
                        continue;
                }
                    if (count==1){
                        System.out.println(str.charAt(i));
            }

    }}}}}
