package com.HermesDev.practicas.java.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Shared last names and first names

*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        HashMap<String, String> result = new HashMap<String, String>();
        result.put("Orlando", "Padilla");
        result.put("Perez", "Carlos");
        result.put("Perez", "Tobi");
        result.put("Hernandez", "Xavi");
        result.put("Ortiz","Tobi");
        result.put("Paddle", "Juan");
        result.put("Gomez", "Charlie");
        result.put("Ortiz", "Juan");
        result.put("Zanetti", "Javier");
        result.put("Constantino", "Marco");
        return result;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
