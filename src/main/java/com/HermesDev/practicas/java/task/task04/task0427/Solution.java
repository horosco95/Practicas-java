package com.HermesDev.practicas.java.task.task04.task0427;

/* 
Describing numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        if (num >=1 && num < 1000){
            if ( (num/100) >= 1){
                if (num % 2 == 0)
                    System.out.println("even three-digit number");
                else 
                    System.out.println("odd three-digit number");
            }
            else if ( (num/10) >= 1){
                if (num % 2 == 0)
                    System.out.println("even two-digit number");
                else 
                    System.out.println("odd two-digit number");
            }
            else {
                if (num % 2 == 0)
                    System.out.println("even single-digit number");
                else 
                    System.out.println("odd single-digit number");
            }
        }

    }
}
