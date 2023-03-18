package com.cydeo.CollectionReview_InterviewAlgo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class test {
    public static void main(String[] args) {

        String str = "XXXXX";
        Map<Character, Integer> numLetter = new HashMap<>();
        for (int i = 0; i <str.length() ; i++) {
            char c = str.charAt(i);

            if (numLetter.containsKey(c)) {
                numLetter.put(c, numLetter.get(c)+1);
            }else {
                numLetter.put(c, 1);
            }
        }

        System.out.println(numLetter);
    }
}
