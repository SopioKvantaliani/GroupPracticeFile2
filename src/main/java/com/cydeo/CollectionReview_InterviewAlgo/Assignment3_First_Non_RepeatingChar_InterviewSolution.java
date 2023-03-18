package com.cydeo.CollectionReview_InterviewAlgo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Assignment3_First_Non_RepeatingChar_InterviewSolution {
    public static void main(String[] args) {

        String str = "JJavaDeveloper";
        System.out.println(findFirstNonRepeating(str));


    }
    public static Character findFirstNonRepeating (String str){

        //Create a map: this will cost me space complexity, space complexity O(n)
        Map<Character, Integer> map = new HashMap<>();
        int count = 0;
        //count the frequency of chars
        for (Character ch:str.toCharArray()){
            if (map.containsKey(ch)){
                count=map.get(ch); //this will return count number; when ch is found we need to assign on count;
                map.put(ch, count+1); //if ch is repeated we take value, increase by 1 and put back in the map
            }else {
                map.put(ch, 1);
            }
        }
        //start from the beginning and check if there is a char with frequency 1
        for (Character ch:str.toCharArray()){
            if (map.get(ch)==1) {
                return ch;
            }
        }


        return null; //if it can not find anything it will return null;
    }
}
