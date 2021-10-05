package com.HermesDev.practicas.java.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Longest sequence

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> array = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        for (int i = 0; i < 10; i++) {
            array.add(Integer.parseInt(reader.readLine()));    
        }
        int contador = 1, aux = 1;
        for (int i = 1; i < 10; i++) {
            if (array.get(i).equals(array.get(i-1))) {
                aux++;
            }
            else {
                if (aux > contador) {
                    contador = aux;
                }
                aux = 1;
            }
        }
        if (aux > contador) {
            contador = aux;
            aux = 1;
        }
        System.out.println(contador);
    }
}
