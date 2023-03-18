package com.cydeo.CollectionReview_InterviewAlgo;

import java.util.HashMap;
import java.util.Map;

public class MapReview {
    public static void main(String[] args) {

        //Create hash map
        Map <Integer, String> studentMap = new HashMap<>();
        studentMap.put(1, "Jack");
        studentMap.put(2, "Julia");
        studentMap.put(3, "Veronica");

        //if we have key it is 0(1);
        //finding item in the array is O(n), but finding in HashMap is O(1);
        //If you want to optimize ArrayList, 99% you will use hashMap with Array Problems;

        System.out.println(studentMap);


    }
}
