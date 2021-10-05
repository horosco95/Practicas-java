package com.HermesDev.practicas.java.task.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
To the top of the list

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i =1; i <=10; i++) {
            list.add(0, reader.readLine());
        }
        list.forEach(System.out::println);
    }
}
