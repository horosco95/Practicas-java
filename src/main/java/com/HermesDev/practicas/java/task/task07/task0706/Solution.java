package com.HermesDev.practicas.java.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Streets and houses

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] arrayInt = new int[15];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int oddCant = 0, evenCant = 0;
        for (int i = 0; i < 15; i++) {
            arrayInt[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < 15; i++) {
            if ( i % 2 == 0 ) {
                evenCant += arrayInt[i];
            }
            else {
                oddCant += arrayInt[i];
            }
        }
        if (oddCant > evenCant) {
            System.out.println("Odd-numbered houses have more residents.");
        }
        else if (evenCant > oddCant) {
            System.out.println("Even-numbered houses have more residents.");
        }
    }
}
