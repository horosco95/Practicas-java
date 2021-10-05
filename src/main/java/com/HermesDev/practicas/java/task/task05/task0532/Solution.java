package com.HermesDev.practicas.java.task.task05.task0532;

import java.io.*;

/* 
Task about algorithms

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum;

        int buffer;
        int n = Integer.parseInt(reader.readLine());
        
        if (n > 0){
            maximum = Integer.parseInt(reader.readLine());
            for (int i = 0; i < n-1; i++){
                buffer = Integer.parseInt(reader.readLine());
                if (buffer > maximum)
                    maximum = buffer;
            }
    
            System.out.println(maximum);
        }
    }
}
