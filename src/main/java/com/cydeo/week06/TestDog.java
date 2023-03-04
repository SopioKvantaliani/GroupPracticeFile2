package com.cydeo.week06;

public class TestDog {
    public static void main(String[] args) {


        DogClass myDog = new DogClass("Hello");
        DogClass yourDog = new DogClass("Hello");

        String str = new String("Hello");
        String str2 = new String("Hello");

        System.out.println(myDog.equals(yourDog));
        System.out.println(str.equals(str2));


    }
}
