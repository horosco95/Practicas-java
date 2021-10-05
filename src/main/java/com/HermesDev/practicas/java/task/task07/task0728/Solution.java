package com.HermesDev.practicas.java.task.task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
/* 
In decreasing order

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        int i = array.length - 1;
        for (; i >=1; i--) {
            for (int j = i-1; j >= 0; j--) {
                if (array[i] > array[j]) {
                    int aux = array[j];
                    array[j] = array[i];
                    array[i] = aux;
                }
            }
            
        }
    }
}
