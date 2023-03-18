package com.cydeo.CollectionReview_InterviewAlgo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetReview {
    public static void main(String[] args) {

        Set <Student> set = new LinkedHashSet<>();
        // Adding elements
        set.add(new Student(1, "Jack"));
        set.add(new Student(2, "Julia"));
        set.add(new Student(3, "Mike"));
        set.add(new Student(4, "Mary"));
        set.add(new Student(4, "Mary"));

        System.out.println(set);

        System.out.println(firsRepeatingChar("Javva Developer"));

    }

    public static Character firsRepeatingChar (String str){
        //What is the time complexity of the following code?  O(n)


        //create a hashSet
        Set <Character> chars = new HashSet<>(); //in here I have space complexity of O(n)


        //iterate over the char array and add chars into hashSet
        for (Character ch: str.toCharArray()) { //converts str into char array to iterate;
            if (!chars.add(ch)){ //don't add ch in chars Set if it exists
                return ch;
            }
        }
        //if add ops is false return that char

        return null;
    }


}
