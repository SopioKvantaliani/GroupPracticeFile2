package com.cydeo.week05;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Q4_FrequencyOfArrayElements {
    public static void main(String[] args) {

        String [] str = {"Sophie", "Levan", "Cherry", "Sophie", "sophie"};

        FrequencyOfArrayElements(str);

    }
    public static void FrequencyOfArrayElements (String [] input) {
        Map<String, Long> conversion = Arrays.stream(input).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));
        System.out.println(conversion);
    }
}
