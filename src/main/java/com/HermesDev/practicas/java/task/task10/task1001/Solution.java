package com.HermesDev.practicas.java.task.task10.task1001;

/* 
Task No. 1 about integer type conversions

*/

public class Solution {
    public static void main(String[] args) {
        int a = 0;
        int b = (byte) a + 46;
        byte c = (byte) (a * b);
        double f = (char) 1234.15;
        long d = (long) (a + f / c + b);
        System.out.println(d);
    }
}
