package com.HermesDev.practicas.java.task.task05.task0526;

/* 
Man and woman

*/

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("alf", 20, "SiempreViva");
        Man man2 = new Man("Albert", 33, "Wall");
        Woman woman1 = new Woman("Lisa", 22, "Styler");
        Woman woman2 = new Woman("Mikasa", 18, "Maria Wall");
        
        System.out.println(man1);
        System.out.println(man2);
        System.out.println(woman1);
        System.out.println(woman2);
    }

    public static class Man {
        String name;
        int age;
        String address;
        
        public Man(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public String toString(){
            return this.name+" "+this.age+" "+this.address;
        }
    }
    public static class Woman {
        String name;
        int age;
        String address;
        
        public Woman(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
        
        public String toString(){
            return this.name+" "+this.age+" "+this.address;
        }
    }
}
