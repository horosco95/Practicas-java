package com.HermesDev.practicas.java.task.task04.task0416;

/* 
Crossing the road blindly

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double number = Double.parseDouble(reader.readLine());
        //if (number >= 0 && number < 60){
            if(number % 5.0 < 3)
                System.out.println("green");
            else if (number % 5.0 < 4)
                System.out.println("yellow");
            else if (number % 5.0 < 5)
                System.out.println("red");
        //}
        
    }
}