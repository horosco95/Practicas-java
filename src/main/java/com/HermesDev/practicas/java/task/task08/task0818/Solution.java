package com.HermesDev.practicas.java.task.task08.task0818;

import java.util.HashMap;

/* 
Only for the rich

*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Overlord", 100);
        map.put("Barrick", 690);
        map.put("Marriot", 980);
        map.put("Havanna", 780);
        map.put("Perez", 190);
        map.put("Chavez", 290);
        map.put("Parley", 400);
        map.put("Gates", 1800);
        map.put("Morgan", 1600);
        map.put("Sanchez", 330);
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        map.values().removeIf( (elem) -> elem < 500 );
    }

    public static void main(String[] args) {

    }
}