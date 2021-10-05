package com.HermesDev.practicas.java.task.task09.task0906;

/* 
Logging stack traces

*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        StackTraceElement calledMethod = stackTraceElements[2];
        System.out.print(calledMethod.getClassName() +": "+ calledMethod.getMethodName() +": "+ s);
    }
}
