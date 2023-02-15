package com.cydeo.week04;

import java.util.HashMap;
import java.util.Map;

public class FrequencyUsingMap {
    public static void main(String[] args) {

        String str = "Hello";
        char [] str2 = str.toCharArray();
        Map<Character,Integer> charMap = new HashMap<Character,Integer>( );

        for (char c : str2){
            if (charMap.containsKey(c)){
                charMap.put(c, charMap.get(c)+1);
            }else {
                charMap.put(c,1);

            }
        }

        System.out.println(charMap);

    }

}