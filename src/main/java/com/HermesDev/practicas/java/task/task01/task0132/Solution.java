package com.HermesDev.practicas.java.task.task01.task0132;

/* 
Sum of the digits of a three-digit number

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int thirdDig = number/100;
        int sndDig = (number - thirdDig*100) / 10;
        int fstDig = number - (thirdDig*100 + sndDig*10);
        return thirdDig + sndDig + fstDig;
    }
}