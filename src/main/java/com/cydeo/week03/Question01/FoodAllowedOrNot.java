package com.cydeo.week03.Question01;

import java.util.function.BiPredicate;

public class FoodAllowedOrNot {

    public static void main(String[] args) {

        System.out.println(foodAllowedOrNot.test("Blue Bird", "Bread"));


    }

    //BiPredicate, ready functional interface.
    //Accepts 2 Arguments.

    public static BiPredicate<String, String> foodAllowedOrNot = (a, b) -> {
        if (a.charAt(0) == b.charAt(0) && a.charAt(a.length() - 1) == b.charAt(b.length()-1)) {

            return true;
        }else {
            return false;
        }
    };

}
