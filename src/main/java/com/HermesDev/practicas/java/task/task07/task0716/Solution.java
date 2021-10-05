package com.HermesDev.practicas.java.task.task07.task0716;

import java.util.ArrayList;

/* 
R or L

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("rose"); // 0
        list.add("love"); // 1
        list.add("lyre"); // 2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        for (int i = 0; i < list.size();) {
            String aux = list.get(i);
            if (aux.contains("r") && aux.contains("l")) {
                i++;
            }
            else {
                if (aux.contains("r")) {
                    list.remove(i);
                }
                else if (aux.contains("l")) {
                    list.add(i, aux);
                    i += 2;
                }
                else i++;
            }
        }
        return list;
    }
}