package com.cydeo.week02.ThiefFox;

import java.util.ArrayList;
import java.util.Arrays;


public class TestFox {
    public static void main(String[] args) {

        Fox fox1 = new Fox("fox1", true, true, "BLACK", 0);
        Fox fox2 = new Fox("fox2",true, true, "BLACK", 2);
        Fox fox3 = new Fox("fox3",true, true, "Black", 3);
        Fox fox4 = new Fox("fox4",false, true, "GRAY", 3);

        ArrayList <Fox> foxes = new ArrayList<>();
        foxes.add(fox1);
        foxes.add(fox2);
        foxes.add(fox3);
        foxes.add(fox4);


        for (Fox eachFox : foxes) {
            if (eachFox.HasATorch==true && eachFox.WearCoat==true && eachFox.BagCount==3){
                System.out.println(Arrays.asList(eachFox) + " is a thief!");
            }else {
                System.out.println(Arrays.asList(eachFox) + " is not a thief fox!");
            }
        }




    }
}
