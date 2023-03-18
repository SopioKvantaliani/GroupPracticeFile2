package com.cydeo.week09;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Q2_AnimalToTheArk {
    public static void main(String[] args) {

        String[] animals = {"dog", "dog", "cat", "cat", "cat", "goat"};
        String[] animal2 = {"dog"};
        String[] animal3 = {"dog", "goat", "cat"};

        System.out.println(AnimalToTheArk(animals));
        System.out.println(AnimalToTheArk(animal2));
        System.out.println(AnimalToTheArk(animal3));
    }

    public static Map<String, Integer> AnimalToTheArk (String [] animal) {

        Map<String, Integer> map = Arrays.stream(animal) //Converting String [] to Map
                .collect(Collectors.toMap(s->s, s->1, Integer::sum));
        Map<String, Integer> newEntry = new HashMap<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue()>=2){
                newEntry.put(entry.getKey(), 2); //set on fixed value
            }
        }
        return newEntry;
    }


}
