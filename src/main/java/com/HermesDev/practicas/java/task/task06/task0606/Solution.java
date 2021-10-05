package com.HermesDev.practicas.java.task.task06.task0606;

import java.io.*;

/* 
Even and odd digits

*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        String number = reader.readLine();
        int digit;
        for (int i = 0; i < number.length(); i++) {
            digit = Integer.parseInt(Character.toString(number.charAt(i)));
            countDigit(digit);
        }
        System.out.println("Even: "+ even + " Odd: "+ odd);
    }
    public static void countDigit(int digito) {
        if (digito % 2 == 0)
            even ++;
        else 
            odd ++;
    }
}
