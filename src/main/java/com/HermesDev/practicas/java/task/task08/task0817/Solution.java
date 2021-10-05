package com.HermesDev.practicas.java.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
We don't need repeats

*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Lorenz","Esteban");
        map.put("Alferez", "Sebastian");
        map.put("Chavez", "Fred");
        map.put("Fernandez", "Diego");
        map.put("Benitez", "Xabi");
        map.put("Pelaez", "Domingo");
        map.put("Hermione", "Clothes");
        map.put("Suarez", "Abigail");
        map.put("Xamarin", "Jose");
        map.put("Tebas", "Xabi");
        return map;
    }

    public static void removeFirstNameDuplicates(Map<String, String> map) {
        ArrayList<String> duplicadoList = new ArrayList<String>();
        int contador = 0;
        for (String elem : map.values()) {
            for (Map.Entry<String, String> pair : map.entrySet()) {
                if (pair.getValue().equals(elem)) {
                    contador++;
                }
            }
            if (contador > 1) {
                if (!duplicadoList.contains(elem)) {
                    duplicadoList.add(elem);
                }
            }
            contador=0;
        }
        for (String elem : duplicadoList) {
            removeItemFromMapByValue(map, elem);
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
