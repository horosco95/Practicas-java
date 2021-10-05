package com.HermesDev.practicas.java.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Playing Javarella

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> array = new ArrayList<Integer>();
        ArrayList<Integer> arrayB3 = new ArrayList<Integer>();
        ArrayList<Integer> arrayB2 = new ArrayList<Integer>();
        ArrayList<Integer> byOther = new ArrayList<Integer>();
        
        for (int i = 0; i < 20; i++) {
            Integer buffer = Integer.parseInt(reader.readLine());
            array.add(buffer);
            if (buffer % 3 != 0 && buffer % 2 != 0) byOther.add(buffer);
            else {
                if (buffer % 3 == 0) arrayB3.add(buffer);
                if (buffer % 2 == 0) arrayB2.add(buffer);
            }
        }
        printList(arrayB3);
        printList(arrayB2);
        printList(byOther);
    }

    public static void printList(List<Integer> list) {
        for (Integer elem : list) {
            System.out.println(elem);
        }
    }
}
