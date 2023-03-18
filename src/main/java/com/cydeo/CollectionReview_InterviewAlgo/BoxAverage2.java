package com.cydeo.CollectionReview_InterviewAlgo;

import javax.xml.crypto.dsig.spec.HMACParameterSpec;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BoxAverage2 {
    public static void main(String[] args) throws IOException {
        //INPUT [uncomment & modify if required]

        ArrayList<Integer> ans=new ArrayList<>();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); String S=br.readLine().trim();
        while(S.equals("FULL") ==false)
        {
            ans.add(Integer.parseInt(S)); S=br.readLine().trim();
        }
        //OUTPUT [uncomment & modify if required]

        System.out.print(boxAverage (ans));
    }

    public static int boxAverage (ArrayList<Integer> ans){
        //this is default OUTPUT. You can change it.
        int result = -404;

        // WRITE YOUR LOGIC HERE
        //initialize min and max
        int min = ans.get(0);
        int max = ans.get(0);
        //loop-find min and max
        for (Integer each:ans){
            if (each>max) {
                max=each;
            }else if (each<min) {
                min=each;
            }
        }
        //return the avg of min and max

        result = (int) Math.ceil(((float)min+max)/2);

        return result;
    }

}

