package com.HermesDev.practicas.java.task.task09.task0919;

/* 
Dividing by zero

*/

public class Solution {

    public static void main(String[] args) {
        try {
            divideByZero();
        }
        catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
    //TODO:
    public static void divideByZero(){
        System.out.println(9/0);
    }
}
