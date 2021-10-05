package com.HermesDev.practicas.java.task.task09.task0905;

/* 
In the blue depths of the stack trace…

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int deep = getStackTraceDepth();
    }

    public static int getStackTraceDepth() {
        int stackTraceDepth = Thread.currentThread().getStackTrace().length;
        System.out.println(stackTraceDepth);
        return stackTraceDepth;
    }
}

