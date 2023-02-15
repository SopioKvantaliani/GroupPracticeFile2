package com.cydeo.week02;

public class UnreachableCodeTest {

    public static void main(String[] args) {

        System.out.println("I will get printed");
        return;  //after that code you can not print anything;

        //System.out.println("I want to get printed");

    }
}
