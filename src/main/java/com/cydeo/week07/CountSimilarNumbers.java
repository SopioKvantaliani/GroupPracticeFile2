package com.cydeo.week07;


import java.util.LinkedHashMap;
import java.util.Map;
public class CountSimilarNumbers {

    public static void main(String[] args) {

        int [] num = {2, 3, 5, 6, 9, 1, 1, 2, 2, 3, 3, 4};
        Map<Integer, Integer> newNum = new LinkedHashMap<>(); //insertion order is same

            for (int each : num){
              if (newNum.containsKey(each)){
                  newNum.put(each, newNum.get(each)+1);
              }else {
                  newNum.put(each,1);
              }
            }

            System.out.println(newNum);

    }
}
