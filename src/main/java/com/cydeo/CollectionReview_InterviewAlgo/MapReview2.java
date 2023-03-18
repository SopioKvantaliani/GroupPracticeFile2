package com.cydeo.CollectionReview_InterviewAlgo;

import java.util.*;
import java.util.stream.Collectors;

public class MapReview2 {
    public static void main(String[] args) {

        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(1, "Jack");
        studentMap.put(2, "Julia");
        studentMap.put(3, "Veronica");

        //How to get values from a map
        Collection<String> list = studentMap.values();
        List<String> list2 = studentMap.values().stream().collect(Collectors.toList());


        //How to get values and sort them
        List<String> list3 = studentMap.values().stream().sorted(((o1, o2) -> o1.compareToIgnoreCase(o2))).collect(Collectors.toList());
        System.out.println(list2);

        Set<Map.Entry<Integer,String>> entries = studentMap.entrySet();
        System.out.println(entries);
        Set<Integer> keySet = studentMap.keySet();
        System.out.println(keySet);

        //We can iterate
        for (Integer each: keySet){ //or we can pass studentMap.keySet and it will give the same result.
            System.out.println(each);
        }


    }
}
