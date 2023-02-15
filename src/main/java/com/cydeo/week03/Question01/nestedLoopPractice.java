package com.cydeo.week03.Question01;

public class nestedLoopPractice {
    public static void main(String[] args) {
        String str = "whhhheccwrrr";
        str = str.toLowerCase();
        String result = "";

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j); //each character of string
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i)==ch){
                    count ++;
                }
            }
             if (count>1 && !result.contains(""+ch)){
            result +=ch;
                }
        }

        System.out.println(result);

    }
}