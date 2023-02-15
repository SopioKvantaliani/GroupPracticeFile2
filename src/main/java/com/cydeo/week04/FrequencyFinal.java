package com.cydeo.week04;

import java.util.Locale;

public class FrequencyFinal {
    public static void main(String[] args) {

        String sentence = "aAbB";
        sentence = sentence.toLowerCase();
        String characters = "";
        String duplicates = "";
        int count = 0;

        for (int i = 0; i < sentence.length(); i++) {
            String current = Character.toString(sentence.charAt(i)); //converting String to
            if (characters.contains(current)){
                if (!duplicates.contains(current)){
                    duplicates +=current;

                }
            }
                    characters+=current;
        }

        int num = duplicates.length(); //count of duplicates
        System.out.println("\""+ sentence+ "\" -> " +num+" # "+ duplicates);





    }
}

