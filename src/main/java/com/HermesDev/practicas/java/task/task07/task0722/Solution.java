package com.HermesDev.practicas.java.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
The end

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        while(true) {
            String buffer = reader.readLine();
            if (buffer.equals("end")) {
                break;
            }
            list.add(buffer);
        }
        for (String elem : list) {
            System.out.println(elem);
        }
    }
}