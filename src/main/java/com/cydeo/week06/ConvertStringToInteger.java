package com.cydeo.week06;

public class ConvertStringToInteger {
    public static void main(String[] args) {

        String str = "1234";
        Integer num = Integer.parseInt(str);
        Integer num2 = Integer.valueOf(str);

        System.out.println(num);
        System.out.println(num2);



    }
}
