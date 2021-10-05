package com.HermesDev.practicas.java.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Longest string

*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<String>();
        int longestStringNumber = 0;
        for (int i=0; i<5; i++) {
            String entrada = reader.readLine();
            if (entrada.length() > longestStringNumber) {
                longestStringNumber = entrada.length();
            }
            strings.add(entrada);
        }
        ArrayList<String> res = new ArrayList<String>();
        for (String elem : strings) {
            if (elem.length() == longestStringNumber) { res.add(elem); }
        }
        res.forEach(System.out::println);
    }
}
