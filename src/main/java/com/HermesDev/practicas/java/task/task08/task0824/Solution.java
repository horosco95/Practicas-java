package com.HermesDev.practicas.java.task.task08.task0824;

/* 
Make a family

*/

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        Human children1 = new Human();
        children1.name = "Veronica";
        children1.age = 12;
        children1.sex = false;
        Human children2 = new Human();
        children2.name = "Tobi";
        children2.age = 22;
        children2.sex = true;
        Human children3 = new Human();
        children3.name = "Lorena";
        children3.sex = false;
        children3.age = 23;

        Human mother = new Human();
        mother.name = "Samantha";
        mother.sex = false;
        mother.age = 46;
        Human father = new Human();
        father.name = "Bart";
        father.sex = true;
        father.age = 47;
        Collections.addAll(mother.children,children1,children2,children3);
        Collections.addAll(father.children,children1,children2,children3);

        Human grandfather1 = new Human();
        grandfather1.name = "Sam";
        grandfather1.sex = true;
        grandfather1.age = 77;
        Human grandfather2 = new Human();
        grandfather2.name = "Jack";
        grandfather2.sex = true;
        grandfather2.age = 88;
        Human gm1 = new Human();
        gm1.name = "Sara";
        gm1.sex = false;
        gm1.age = 69;
        Human gm2 = new Human();
        gm2.name = "Tamara";
        gm2.age = 68;
        gm2.sex = false;
        grandfather1.children.add(father);
        gm1.children.add(father);
        grandfather2.children.add(mother);
        gm2.children.add(mother);

        ArrayList<Human> family = new ArrayList<Human>();
        Collections.addAll(family,children1,children2,children3,father,mother,gm1,gm2,grandfather1,grandfather2);
        family.forEach(System.out::println);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<Human>();

        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", children: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
