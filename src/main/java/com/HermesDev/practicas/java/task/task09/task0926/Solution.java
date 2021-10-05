package com.HermesDev.practicas.java.task.task09.task0926;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.stream.IntStream;

/* 
List of number arrays

*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //write your code here
        ArrayList<int[]> list = new ArrayList<int[]>();
        //Add to the list five array objects whose lengths are 5, 2, 4, 7, and 0, respectively.
        list.add(new int[5]);
        list.add(new int[2]);
        list.add(new int[4]);
        list.add(new int[7]);
        list.add(new int[0]);
        //Fill the arrays with random number
        Random randomGen = new Random();
        //Option 1
        /*for (int[] array : list) {
            for (int i = 0; i < array.length; i++) {
                array[i] = randomGen.nextInt(100000); // Numeros aleatorios: [0-100000)
            }
        }*/
        //Option 2
        for (int[] array : list) {
            IntStream intStream = randomGen.ints(array.length,-9999,10000);
            Iterator iterator = intStream.iterator();
            int i = 0;
            while (iterator.hasNext()) {
                array[i] = (int) iterator.next(); // Numeros aleatorios: [-9999;100000)
                i++;
            }
        }
        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
