package com.HermesDev.practicas.java.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Going national

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        char[] array = text.toLowerCase().toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (i == 0)
                array[0] = Character.toUpperCase(array[0]);
            else if (array[i-1] == ' ' && array[i] != ' ')
                array[i] = Character.toUpperCase(array[i]);
        }
        String res = new String(array);
        System.out.println(res);
    }
}
