package com.HermesDev.practicas.java.task.task09.task0927;

import java.util.*;

/* 
Ten cats

*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //write your code here
        Map<String, Cat> map = new HashMap<String, Cat>();
        LinkedList<String> list = new LinkedList<String>();
        //Adding 10 cats
        Collections.addAll(list, "Tomas","Charlie","Tobi","Mily","Oky","Bart","Mikey","Steve","Frida","Celia");
        for (String elem : list) {
            map.put(elem, new Cat(elem));
        }
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //write your code here
        Set<Cat> set = new HashSet<Cat>();
        set.addAll(map.values());
        return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
