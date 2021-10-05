package com.HermesDev.practicas.java.task.task04.task0409;

/* 
Closest to 10

*/

public class Solution {
    public static void main(String[] args) {
        displayClosestToTen(8, 11);
        displayClosestToTen(7, 14);
    }

    public static void displayClosestToTen(int a, int b) {
        int res1 = abs(a-10);
        int res2 = abs(b-10);
        
        if (res1 < res2)
            System.out.println(a);
        else if (res1 > res2)
            System.out.println(b);
        else 
            System.out.println(a);

    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}