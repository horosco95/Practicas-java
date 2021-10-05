package com.HermesDev.practicas.java.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Expressing ourselves more concisely

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> lista = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int shortestString;
        String buffer = reader.readLine();
        lista.add(buffer);
        shortestString = buffer.length();
        for (int i = 0; i<4; i++){
            buffer = reader.readLine();
            lista.add(buffer);
            if (buffer.length() < shortestString) {shortestString = buffer.length();}
        }
        ArrayList<String> res = new ArrayList<String>();
        for (String elem : lista) {
            if (elem.length() == shortestString) {res.add(elem);}
        }
        res.forEach(System.out::println);
    }
}
