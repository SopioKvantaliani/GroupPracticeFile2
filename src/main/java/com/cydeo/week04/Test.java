package com.cydeo.week04;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Test {
    public static void main(String[] args) {

        uniqueChar("JavaJavaee\n");
        System.out.println("--------------------------------");


          int [] array = {6,8, 3, 4,6, 9};
          int num = Arrays.stream(array).max().getAsInt();
          System.out.println(num);

          System.out.println("--------------------------------");

          System.out.println(FindFactorialNumber(7));

          System.out.println("--------------------------------");

          int [] maxValue = {2, 3, 4, 5, 6};
          int maxValueFinal = Arrays.stream(maxValue).max().getAsInt();
          System.out.println(maxValueFinal);

         System.out.println("--------------------------------");
        System.out.println("Find Max Number");

         List<Integer>list = Arrays.asList(10, 29, 34, 22, 13);

        Optional<Integer> maxValue2 = list.stream().max(Comparator.comparing(Integer::intValue));
        if (maxValue2.isPresent()){
            System.out.println("the max value is: "+maxValue2.get());
        }
        System.out.println("--------------------------------");
        System.out.println("Convert primitive int to Array");

        int num2 =10345;
        int [] digits = Integer.toString(num2).chars().map(c->c-'0').toArray(); //[1, 0, 3, 4, 5]
        System.out.println(Arrays.toString(digits));
        for (int each : digits){
            System.out.println(each);
        }

        //How to find first Repetitive and Non-Repetitive Character from a Given String
        System.out.println("--------------------------");
        String input = "ddffgfgi";
         Map<Character,Long> charCount = input.chars().mapToObj(i->(char)i)
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
        Optional<Character>firstNonRepeat = charCount.entrySet().stream()
                .filter(e->e.getValue()==1)
                .map(e-> e.getKey()).findFirst();


        Optional<Character>firstRepeatedElement = charCount.entrySet().stream()
                .filter(e->e.getValue()>1)
                .map(e->e.getKey()).findFirst();
                System.out.println("First Non-Repeated Character "+ firstNonRepeat.orElseThrow());
                System.out.println("First Repeated Character "+firstRepeatedElement.orElseThrow());

//        if (firstNonRepeat.isPresent()){
//
//        }

        //need to add, if all elements match, write "space";




    }

    public static void uniqueChar (String input){

        Map<Character,Long> result  = input.chars().mapToObj(c->(char) c)
                .collect(Collectors.groupingBy(c->c, Collectors.counting()));

        result.forEach((k,v)-> {
            if (v>1){
                System.out.print(k+":"+v+" ");
            }
        });
    }



    private static Long FindFactorialNumber (long n){
        return LongStream.rangeClosed(1,n).reduce(1,(long x, long y)->x*y);
    }

}

