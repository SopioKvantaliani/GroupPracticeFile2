package com.cydeo.week04;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class FrequencyDuplicateChar {
    public static void main(String[] args) {
        String str = "Abbddcs";
        int count = 0;
        char[] charArray = str.toCharArray();
        Map<Character, Integer> countDuplicate = new HashMap<Character, Integer>();

        for (char each : charArray) {
            if (countDuplicate.containsKey(each)) {
                countDuplicate.put(each, countDuplicate.get(each) + 1);
            } else {
                countDuplicate.put(each, 1);
            }
        }

        if (countDuplicate.containsValue(1) && !(countDuplicate.containsValue(2))){
            System.out.println(str+" 0 # no characters repeats more than once");
        }

        for (Map.Entry<Character,Integer>entry:countDuplicate.entrySet()){
           if (entry.getValue()>1){
               System.out.println(str+"->"+entry.getValue()+" # "+entry.getKey());
           }
        }





            //    System.out.print(entry.getKey() + ":" + entry.getValue() + " ");
    }
}



