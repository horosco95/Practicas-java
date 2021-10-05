package com.HermesDev.practicas.java.task.task09.task0907;

/* 
Exception when working with numbers

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try {

        int a = 42 / 0;

        }
        catch (ArithmeticException e){
            System.out.println(e.getClass().getTypeName());
        }
    }
}
