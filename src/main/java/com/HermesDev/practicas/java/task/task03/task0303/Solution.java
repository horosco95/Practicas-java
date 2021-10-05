package com.HermesDev.practicas.java.task.task03.task0303;

/* 
Currency exchange

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(2,0.98));
        System.out.println(convertEurToUsd(9,0.90));
    }

    public static double convertEurToUsd(int eur, double exchangeRate) {
        return eur*exchangeRate;
    }
}
