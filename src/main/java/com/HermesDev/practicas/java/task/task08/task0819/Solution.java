package com.HermesDev.practicas.java.task.task08.task0819;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
/* 
Set of cats

*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        int contador = 0;
        Iterator<Cat> iterar = cats.iterator();
        while (iterar.hasNext()) {
            Cat elem = iterar.next();
            if (contador == 1) {
                iterar.remove();
            }
            contador++;
        }

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> set = new HashSet<Cat>();
        for (int i = 0; i < 3; i++) {
            set.add(new Cat());
        }
        return set;
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat elem : cats) {
            System.out.println(elem);
        }
    }

    public static class Cat {
    }
}
