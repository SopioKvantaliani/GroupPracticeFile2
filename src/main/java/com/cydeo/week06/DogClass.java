package com.cydeo.week06;

public class DogClass {
    private String dog;


    public DogClass(String dog) {
        this.dog = dog;
    }

    public String getDog() {
        return dog;
    }


    public boolean equals (Object obj){
    if (obj.equals(dog)){
        return true;
    }else {
        return false;
    }

    }

}