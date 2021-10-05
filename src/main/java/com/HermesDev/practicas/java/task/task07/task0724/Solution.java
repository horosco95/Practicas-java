package com.HermesDev.practicas.java.task.task07.task0724;

/* 
Family census

*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> list = new ArrayList<Human>();
        Human tom = new Human("Tom", true, 69);
        Human sam = new Human("Sam", true, 66);
        Human mary = new Human("Mary",false, 66);
        Human marge = new Human("Marge", false, 68);
        Human phil = new Human("Phil", true, 36, tom, mary);
        Human barbara = new Human("Barbara", false,38, sam, marge);
        list.add(sam);
        list.add(tom);
        list.add(mary);
        list.add(marge);
        list.add(phil);
        list.add(barbara);
        list.add(new Human("Cloyde", false, 16, phil, barbara));
        list.add(new Human("Bartolomeo", true, 8, phil, barbara));
        list.add(new Human("Stuart", true, 11, phil, barbara));
        list.forEach(System.out::println);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father, mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }
        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            if (this.father != null) {
                text += ", father: " + this.father.name;
            }
            if (this.mother != null) {
                text += ", mother: " + this.mother.name;
            }
            return text;
        }
    }
}