package com.HermesDev.practicas.java.task.task04.task0443;


/* 
A name is a name

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int year = Integer.parseInt(reader.readLine());
        int mm = Integer.parseInt(reader.readLine());
        int dd = Integer.parseInt(reader.readLine());
        System.out.print("My name is "+ name+".\nI was born on ");
        System.out.println(mm+"/"+dd+"/"+year);
    }
}
