package com.HermesDev.practicas.java.task.task07.task0715;

import java.util.ArrayList;
import java.util.Collections;

/* 
More Sam-I-Am

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "Sam", "I", "Am");
        list.add("Ham");
        for (int i = 1; i < 4; i += 2) {
            list.add(i, "Ham");
        }
        list.forEach(System.out::println);
    }
}
