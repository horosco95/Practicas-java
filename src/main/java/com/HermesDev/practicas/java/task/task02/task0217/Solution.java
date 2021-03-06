package com.HermesDev.practicas.java.task.task02.task0217;

/* 
Minimum of four numbers

*/

public class Solution {
    public static int min(int a, int b, int c, int d) {
        int l = min(a,b);
        int r = min(c,d);
        if (l < r) return l;
        else return r;
    }

    public static int min(int a, int b) {
        if (a<b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-20, -10, -30, -40));
        System.out.println(min(-20, -10, -30, 40));
        System.out.println(min(-40, -10, -30, 40));
    }
}
