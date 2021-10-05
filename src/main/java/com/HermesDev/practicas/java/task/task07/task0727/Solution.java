package com.HermesDev.practicas.java.task.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Changing functionality

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }
        /*
        ArrayList<String> listUpperCase = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            listUpperCase.add(s.toUpperCase());
        }

        for (int i = 0; i < listUpperCase.size(); i++) {
            System.out.println(listUpperCase.get(i));
        }*/
        ArrayList<String> evenOddList = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++) {
            String elem = list.get(i);
            if (elem.length() % 2 == 0) {
                elem = elem.concat(" "+ elem );
                evenOddList.add(elem);
            }
            else {
                elem = elem.concat(" "+ elem +" "+ elem);
                evenOddList.add(elem);
            }
        }
        for (int i = 0; i < evenOddList.size(); i++) {
            System.out.println(evenOddList.get(i));
        }
    }
}
