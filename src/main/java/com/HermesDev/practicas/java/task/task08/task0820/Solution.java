package com.HermesDev.practicas.java.task.task08.task0820;

import java.util.HashSet;
import java.util.Set;

/* 
Animal set

*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<Cat>();

        for (int i = 0; i < 4; i++) {
            result.add(new Cat());
        }

        return result;
    }

    public static Set<Dog> createDogs() {
        HashSet<Dog> result = new HashSet<Dog>();
        for (int i = 0; i < 3; i++) {
            result.add(new Dog());
        }
        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        HashSet<Object> res = new HashSet<Object>();
        res.addAll(cats);
        res.addAll(dogs);
        return res;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        pets.removeIf((elem)-> cats.contains(elem));
    }

    public static void printPets(Set<Object> pets) {
        pets.forEach(System.out::println);
    }

    public static class Cat {
        
    }
    
    public static class Dog {
        
    }
}
