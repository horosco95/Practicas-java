package com.HermesDev.practicas.java.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Month number

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();
        ArrayList<String> listMonth = new ArrayList<String>();
        Collections.addAll(listMonth,"January","February","March","April","May","June","July","August","September","October","November","December");

        if (listMonth.contains(month)) System.out.println(month + " is month " + (listMonth.indexOf(month)+1));
    }
}
