package com.HermesDev.practicas.java.task.task06.task0614;

import java.util.ArrayList;

/* 
Static cats

*/

public class Cat {
    public static ArrayList<Cat> cats = new ArrayList<Cat>();

    public Cat() {
    }

    public static void main(String[] args) {
        for (int i=0 ; i < 10; i++){
            Cat cat = new Cat();
            Cat.cats.add(cat);
        }
        printCats();
    }

    public static void printCats() {
        Cat.cats.forEach(System.out::println);
    }
}
