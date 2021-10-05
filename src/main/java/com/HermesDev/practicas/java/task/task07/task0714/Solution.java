package com.HermesDev.practicas.java.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Words in reverse

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> array = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            array.add(reader.readLine());
        }
        array.remove(2);
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(3-i));
        }
    }
}


