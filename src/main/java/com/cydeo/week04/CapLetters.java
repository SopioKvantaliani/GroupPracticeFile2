package com.cydeo.week04;

import java.util.Arrays;
import java.util.Locale;

public class CapLetters {
    public static void main(String[] args) {


        String str = "Java DevEloper";
        String str2 = "Sophie";

        System.out.println(str.compareTo(str2)); //compares length and returns difference in length;
        System.out.println(str.substring(2)); //print from index 2
        System.out.println(str.substring(2,4));//print index 2 and index 3;
        System.out.println(str.equals(str2)); //compares strings eachOther and returns boolean;


        capitalize("I am java developer and I love coding.");


    }

    public static void capitalize (String input){
        String [] newPrint = input.split(" ");

        for (String each: newPrint){
            String s = each.toUpperCase().charAt(0) + each.substring(1, each.length());
            System.out.print(s+" ");
        }
    }
}
