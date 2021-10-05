package com.HermesDev.practicas.java.task.task08.task0814;

import java.util.HashSet;
import java.util.Set;
import java.util.Random;
/* 
Greater than 10? You're not a good fit for us

*/

public class Solution {
    public static HashSet<Integer> createSet() {
        Random randomGen = new Random();
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; set.size() < 20; i++) {
            int elem = randomGen.nextInt(100);
            set.add(elem);
        }
        return set;
    }

    public static HashSet<Integer> removeAllNumbersGreaterThan10(HashSet<Integer> set) {
        HashSet<Integer> lessThan10Set = new HashSet<Integer>();
        set.removeIf((elem)-> elem > 10);
        lessThan10Set = set;
        return lessThan10Set;
    }

    public static void main(String[] args) {

    }
}
