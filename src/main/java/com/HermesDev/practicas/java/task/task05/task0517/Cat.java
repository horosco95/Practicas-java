package com.HermesDev.practicas.java.task.task05.task0517;

/* 
Creating cats

*/

public class Cat {
    String name = null;
    int weight = 1;
    int age = 1;
    String address = null;
    String color = "black";
    
    public Cat(String name){
        this.name = name;
    }
    public Cat(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
    }
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Cat(int weight, String color){
        this.weight = weight;
        this.color = color;
    }
    public Cat(int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}
