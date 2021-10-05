package com.HermesDev.practicas.java.task.task04.task0414;

/* 
Number of days in the year

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(reader.readLine());
        int days;
        
        if (year%400 == 0)
            days = 366;
        else if (year % 100 == 0)
            days = 365;
        else if (year % 4 == 0)
            days = 366;
        else
            days = 365;
        
        System.out.println("Number of days in the year: "+ days);
    }
}