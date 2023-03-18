package com.cydeo.CollectionReview_InterviewAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReveiwOfCollection {

    public static void main(String[] args) {


        //Convert an Array to ArrayList with Arrays.asList()
        Integer [] arr = {1, 2, 3};
        List<Integer> list = Arrays.asList(arr);
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list);

        //Convert an Array to ArrayList with Collections.addAll()
        List<Integer> list3 = new ArrayList<>();
        Collections.addAll(list3,arr);

        //convert an ArrayList to Array
        Integer[] arr2 = list3.toArray(new Integer[0]);

        //convert an ArrayList to Array
        int [] arr3 = list3.stream().mapToInt(i->i).toArray();

        //Sort without comparator
        Collections.sort(list2); //complexity nlogn. When we have sorting, we need to put always complexity nlogn.
        System.out.println(list2);
        Collections.sort(list2, Collections.reverseOrder());

        //Binary search on collection Syntax: int binarySearch (listName, key), runs log(n), if we have duplicates never shows the first one.
        //if we use linkedList it has random access and does not guarantee log(n) run time.



    }
}
