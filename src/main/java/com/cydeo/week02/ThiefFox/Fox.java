package com.cydeo.week02.ThiefFox;


public class Fox {
   public String Name;
   public Boolean WearCoat, HasATorch;
   public String CoatColor;
   public Integer BagCount;

    public Fox(String name, Boolean wearCoat, Boolean hasATorch, String coatColor, Integer bagCount) {
        Name = name;
        WearCoat = wearCoat;
        HasATorch = hasATorch;
        CoatColor = coatColor;
        BagCount = bagCount;
    }


    public String toString() {
        return getClass().getSimpleName() + "{"  +
                " " + Name + '\'' +
                '}';
    }
}
