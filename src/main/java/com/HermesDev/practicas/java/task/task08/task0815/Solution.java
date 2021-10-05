package com.HermesDev.practicas.java.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;

/* 
Census

*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Laport", "Albert");
        map.put("Ackerman", "Levi");
        map.put("Lorenzo", "Albert");
        map.put("Balcarce", "Adriano");
        map.put("de la Plaza", "Esteban");
        map.put("Musso", "Adriano");
        map.put("Klein", "Calvin");
        map.put("Fonseca", "Guillermo");
        map.put("Estebanez", "Frank");
        map.put("Medici", "Tomas");
        return map;
    }

    public static int getSameFirstNameCount(HashMap<String, String> map, String name) {
        int contador = 0;
        for (String elem : map.values()) {
            if (elem.equals(name)) {
                ++contador;
            }
        }
        return contador;
    }

    public static int getSameLastNameCount(HashMap<String, String> map, String lastName) {
        int contador = 0;
        for (String elem : map.keySet()) {
            if (elem.equals(lastName)) {
                ++contador;
            }
        }
        return contador;
    }

    public static void main(String[] args) {

    }
}
