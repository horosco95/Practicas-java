package com.HermesDev.practicas.java.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Cat relations

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandfatherName = reader.readLine();
        Cat catGrandfather = new Cat(grandfatherName);
        Cat catGrandMother = new Cat(reader.readLine());
        
        Cat catFather = new Cat(reader.readLine(), null, catGrandfather);
        Cat catMother = new Cat(reader.readLine(), catGrandMother);

        Cat catSon = new Cat(reader.readLine(), catMother, catFather);
        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);

        System.out.println(catGrandfather);
        System.out.println(catGrandMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat mother;
        private Cat father;

        Cat(String name) {
            this.name = name;
        }
        Cat(String name, Cat mother) {
            this.name = name;
            this.mother = mother;
        }
        /*Cat(String name, Cat father) {
            this.name = name;
            this.father = father;
        }*/
        Cat(String name, Cat mother, Cat father) {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        @Override
        public String toString() {
            String sentence;
            if (mother == null) {
                sentence = "The cat's name is " + name + ", no mother, ";
            } else {
                sentence = "The cat's name is " + name + ", " + mother.name + " is the mother, ";
            }
            if (father == null) {
                sentence = sentence.concat("no father");
            }
            else {
                sentence = sentence.concat(father.name +" is the father");
            }
            return sentence;
        }
    }

}
