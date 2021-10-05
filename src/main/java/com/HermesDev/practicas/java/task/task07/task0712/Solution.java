package com.HermesDev.practicas.java.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Shortest or longest

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        int longest, shortest;
        String buffer = reader.readLine();
        list.add(buffer);
        shortest = buffer.length();
        longest = buffer.length();
        for (int i=1; i < 10; i++) {
            buffer = reader.readLine();
            list.add(buffer);
            int length = buffer.length();
            if (length > longest) {
                longest = length;
            }
            if (length < shortest) {
                shortest = length;
            }
        }
        for (String x : list) {
            if (x.length() == shortest || x.length() == longest) {
                System.out.println(x);
                break;
            }
        }
    }
}
