package com.cydeo.week03.Question01;

public class Check {

    public static void main(String[] args) {

        getFirstNonRepeatingVowelIndex("Shohiee");

    }


   public static int getFirstNonRepeatingVowelIndex (String input) {
       for (int i = 0; i < input.length(); i++) {
           char currentChar = input.charAt(i);
           if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
               int foundVowelOccurrenceCount = 0;
               for (int j = 0; j < input.length(); j++) {
                   if (currentChar == input.charAt(j)) {
                       foundVowelOccurrenceCount++;
                       if (foundVowelOccurrenceCount > 1)
                           break;
                   }
               }
               if (foundVowelOccurrenceCount == 1)
                   return input.charAt(i);
           }
       }
       return -1;


   }};