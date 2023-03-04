package com.cydeo.week06;

import java.util.Arrays;

public class SplitMethodString {
    public static void main(String[] args) {

//        String [] str2 = "Apple, WaterMelon, Peach, Strawberry".split(",");
//        System.out.println(Arrays.toString(str2));

//
//
//        String[] Word = "The quick brown fox jumps over the lazy dog".split("\\s+",5); //regular expression
//        System.out.println(Arrays.toString(Word));
//
//
        String str = "geeksss@forss@gsseekssssssss";
        String [] array = str.split("s", -1); //last part discarded

//
//        System.out.println(Arrays.toString(array));

//        String[] Word = "The quick brown fox jumps over the lazy dog"
//                .split(" ",3); //regular expression
//         System.out.println(Arrays.toString(Word));

        String[] Word2 = "We!are getting ready! for our presentation?"
                .split("[,!,?,\\s]+"); //regular expression
        System.out.println(Arrays.toString(Word2));



    }
}




