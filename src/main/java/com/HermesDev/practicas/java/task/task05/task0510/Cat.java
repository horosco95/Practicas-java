package com.HermesDev.practicas.java.task.task05.task0510;

/* 
Initializing cats

*/

public class Cat {
    String name = null, color = "yellow", address = null;
    int weight = 3, age = 2;
    public void initialize(String name){
        this.name = name;
    }
    public void initialize(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
    }
    public void initialize(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void initialize(int weight, String color){
        this.weight = weight;
        this.color = color;
    }
    public void initialize(int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
    }
    public static void main(String[] args) {

    }
}
