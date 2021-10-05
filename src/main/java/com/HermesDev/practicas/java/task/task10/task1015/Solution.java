package com.HermesDev.practicas.java.task.task10.task1015;

import java.util.ArrayList;

/* 
Array of string lists

*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] array = new ArrayList[15];
        String[] toCreate = {"Alexander", "Gandalf", "Malcolm", "Rupert", "Xavi"};
        for (int i = 0; i < array.length; i++) {
            array[i] = new ArrayList<String>();
            for (String cpy : toCreate) {
                array[i].add(cpy);
            }
        }
        return array;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}