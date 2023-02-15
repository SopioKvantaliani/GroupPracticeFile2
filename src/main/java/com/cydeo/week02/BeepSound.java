package com.cydeo.week02;

import java.awt.*;

public class BeepSound {
    public static void main(String[] args) {


        int beepCount = 5;

        for (int i = 0; i < beepCount; i++) {

            Toolkit.getDefaultToolkit().beep();
            try {
                Thread.sleep(1000); // introduce delay
            } catch (InterruptedException e) {
            }
        }
    }
}


