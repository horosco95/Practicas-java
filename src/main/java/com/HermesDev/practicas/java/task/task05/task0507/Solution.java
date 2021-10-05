package com.HermesDev.practicas.java.task.task05.task0507;
import java.io.*;

/* 
Arithmetic mean

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number, count=0;
        double arithMean = 0;
        while(true){
            number = Integer.parseInt(reader.readLine());
            if(number == -1)
                break;
            else {
                arithMean += number;
                count++;
            }
        }
        System.out.println(arithMean/count);
    }
}

