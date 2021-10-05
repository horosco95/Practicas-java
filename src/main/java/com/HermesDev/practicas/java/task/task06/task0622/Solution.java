package com.HermesDev.practicas.java.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Ascending numbers

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(Integer.parseInt(reader.readLine()));
        list.add(Integer.parseInt(reader.readLine()));
        list.add(Integer.parseInt(reader.readLine()));
        list.add(Integer.parseInt(reader.readLine()));
        list.add(Integer.parseInt(reader.readLine()));

        Collections.sort(list);
        list.forEach(System.out::println);
    }
}
