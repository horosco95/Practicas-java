package com.HermesDev.practicas.java.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

/* 
Method in a try-catch

*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }
    //TODO
    public static void readData() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Integer> list = new LinkedList<Integer>();
        try {
            while (true)
                list.add(Integer.parseInt(reader.readLine()));
        }
        catch (NumberFormatException | IOException e) {
            list.forEach(System.out::println);
        }
    }
}
