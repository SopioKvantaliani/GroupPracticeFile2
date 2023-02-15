package com.cydeo.week02;

import java.util.Scanner;

public class NumberFormatException {
    public static void main(String[] args) {
        int number;

        Scanner input = new Scanner(System.in);
        while (true){
            System.out.println("Enter any valid number");
            try {
                number = Integer.parseInt(input.next());
                System.out.println("You entered: "
                        + number);
                break;
            }catch (java.lang.NumberFormatException e){
                System.out.println(  "NumberFormatException occurred");
            }

        }


    }

}

