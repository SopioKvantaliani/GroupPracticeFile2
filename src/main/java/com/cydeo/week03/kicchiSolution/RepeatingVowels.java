package com.cydeo.week03.kicchiSolution;

import java.util.LinkedHashMap;
import java.util.Map;

public class RepeatingVowels {
    public static void main(String[] args) {



    }
    public static int getFirstNonRepeatingVowel(String input) {
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                int vowelCount = 0;
                for (int j = 0; j < input.length(); j++) {
                    if (ch == input.charAt(j)) {
                        vowelCount++;
                    }
                }
                if (vowelCount == 1)
                    return i;
            }
        }
        return -1;
    }


    static int getIndexOfFirstNonRepeatingVowel_map(String input){
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                if (!map.containsKey(ch)){
                    map.put(ch, i);
                } else {
                    map.put(ch, -5);
                }
            }
        }
        if (!map.isEmpty()){
            for (Map.Entry<Character, Integer> e : map.entrySet()) {
                int index = e.getValue();
                if ( index != -5){
                    return index;
                }
            }
        }
        return -1;
    }
}
