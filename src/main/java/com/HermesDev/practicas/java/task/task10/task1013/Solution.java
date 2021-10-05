package com.HermesDev.practicas.java.task.task10.task1013;

/* 
Human class constructors

*/

import java.util.Set;

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private int age;
        private Human mom;
        private Human dad;
        private String job;
        private Set<String> prizes;

        public Human(String name, int age) {
            this.age = age;
            this.name = name;
        }
        public Human(String name, Human mother) {
            this.name = name;
            this.mom = mother;
        }
        public Human(String name, Human mother, Human father) {
            this.name = name;
            this.mom = mother;
            this.dad = father;
        }
        public Human(String name, String job, Set<String> prizes) {
            this.name = name;
            this.job = job;
            this.prizes = prizes;
        }
        public Human(String name, int age, String job){
            this.name = name;
            this.age = age;
            this.job = job;
        }
        public Human(String name, String job) {
            this.name = name;
            this.job = job;
        }
        public Human(String name, int age, Set<String> prizes) {
            this.name = name;
            this.age = age;
            this.prizes = prizes;
        }
        public Human(String name, Human mother, String job) {
            this.name = name;
            this.mom = mother;
            this.job = job;
        }
        public Human(String name, Human mother, String job, Set<String> prizes) {
            this.name = name;
            this.mom = mother;
            this.job = job;
            this.prizes = prizes;
        }
        public Human(String name, String job, Human mother, Human father, int age, Set<String> prizes) {
            this.name = name;
            this.job = job;
            this.mom = mother;
            this.dad = father;
            this.age = age;
            this.prizes = prizes;
        }
    }
}
