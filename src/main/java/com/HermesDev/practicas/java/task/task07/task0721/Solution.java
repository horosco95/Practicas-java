package com.HermesDev.practicas.java.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/* 
Min and max in arrays

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;

        int[] list = new int[20];
        for (int i = 0; i < 20; i++) {
            list[i] = (Integer.parseInt(reader.readLine()));
        }
        maximum = list[0];
        minimum = maximum;
        for (int i= 1; i < 20; i++) {
            int elem = list[(i)];
            if (elem > maximum) {
                maximum = elem;
            }
            if (elem < minimum) {
                minimum = elem;
            }
        }
        System.out.print(maximum + " " + minimum);
    }
}
