package com.cydeo.week05;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Q3_FirstUniqueCharacter {

    public static void main(String[] args) {

    FirstNonRepeatedChar("SooPhie");


    }

    public static void FirstNonRepeatedChar (String input){
        Map<Character,Long> charCount = input.toLowerCase().chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));
        Optional<Character> firstNonRepeat = charCount.entrySet().stream()
                .filter(e->e.getValue()==1)
                .map(e-> e.getKey()).findFirst();

        if (firstNonRepeat.isPresent()) {
            System.out.println("First Non Repeated Character " + firstNonRepeat.get());
        };

    }

}
