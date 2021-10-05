package com.HermesDev.practicas.java.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Checking the order

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        int length = 0;
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }
        length = list.get(0).length();
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).length() <= length) {
                System.out.println(i);
                break;
            }
            else length = list.get(i).length();
        }
    }
}

