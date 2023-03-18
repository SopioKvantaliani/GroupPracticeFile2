package com.cydeo.CollectionReview_InterviewAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Assignment2_NumberOfPeopleInBus_InterviewSolution {
    public static void main(String[] args) {

        ArrayList<int[]> busStop= new ArrayList<>();
        busStop.add(new int[]{10,0}); //first stop
        busStop.add(new int[]{3,5});
        busStop.add(new int[]{2,5}); //last stop

        System.out.println(countPassengers(busStop));

        List<Integer> sopo = new Vector();
        sopo.add(1);
        sopo.add(2);
        System.out.println(sopo);
    }

    public static int countPassengers (ArrayList<int[]> stops){
        //Runs in O(n) complexity because there is a single loop with size n;

        int numOfPeople =0;
        for (int i = 0; i < stops.size(); i++) {
            numOfPeople=numOfPeople+ stops.get(i)[0]-stops.get(i)[1];
        }
        return numOfPeople;
    }
}
