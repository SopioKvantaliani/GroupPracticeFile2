package com.cydeo.week09;

import java.lang.reflect.Array;

public class Q1_LengthOfLastWord {
    public static void main(String[] args) {


        String str_Sopo = "Hello World";
        String str2_Sopo = "fly me to the moon";
        String str3_Sopo = "Hello";
        String str4_Sopo = "    o";
        System.out.println(LengthOfLastWord(str_Sopo));
        System.out.println(LengthOfLastWord(str2_Sopo));
        System.out.println(LengthOfLastWord(str3_Sopo));
        System.out.println(LengthOfLastWord(str4_Sopo));




    }

    public static int LengthOfLastWord (String s){
        s= s.trim();
        if (s.length()<=1){
            return 1;
        }
        if (!(s.contains(" "))){
            return s.length();
        }


        int lastSpaceIndex = s.lastIndexOf(" ");//get the index of the last space
        String result = s.substring(lastSpaceIndex);//get the all characters after last space index
        int output = result.length()-1;
        return output;
    }

}
