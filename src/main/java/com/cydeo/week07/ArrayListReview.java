package com.cydeo.week07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListReview {
    public static void main(String[] args) {
        //Create ArrayList and a class
        List<Student> students = new ArrayList<>();

        //Add elements to ArrayList

        students.add(new Student(1, "Jack"));
        students.add(new Student(2, "Julia"));
        students.add(new Student(3, "Mike"));
        students.add(new Student(4, "Mary"));


        //Iteration on ArrayLists
        //1.For Loop with get(index)

        System.out.println("Printing with legacy for-loop....................");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }

        //2.Iterator
        //Forward Iteration
        System.out.println("Printing with Iterator....................");
        //while using Iterator we can not jump from one element to another. It goes from index 0 to the end.
        //this is the difference between for loop and iterator.
        Iterator iter = students.listIterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }


        System.out.println("Printing Backward with Iterator....................");
        //Backwards Iteration
        while (((ListIterator<?>) iter).hasPrevious()) {
            System.out.println(((ListIterator<?>) iter).previous());
        }
            }
        }
