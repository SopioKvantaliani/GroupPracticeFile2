package com.cydeo.CollectionReview_InterviewAlgo;
import java.util.*;
import java.io.*;
import java.lang.Math;
public class BoxAverage {
    public static void main(String[] args) throws IOException {
        //INPUT [uncomment & modify if required]
        ArrayList<Integer> ans = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine().trim();

        while (S.equals("FULL") == false) {
            ans.add(Integer.parseInt(S));
            S = br.readLine().trim();
        }
        //OUTPUT [uncomment & modify if required]

        System.out.print(boxAverage(ans));
    }

    public static int boxAverage(ArrayList<Integer> ans) {
        //this is default OUTPUT. You can change it.
        int max = ans.get(0);
        int min = ans.get(0);

        // WRITE YOUR LOGIC HERE
        for (int each: ans){
            max= Math.max(max,each);
            min = Math.min(min,each);
        }


        return (max==min)? max : Math.round(max+min)/2;
    }

}