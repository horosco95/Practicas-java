package com.HermesDev.practicas.java.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Vowels and consonants

*/

public class Solution {
    public static char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = new String(reader.readLine());
        ArrayList<String> vowelList = new ArrayList<String>();
        ArrayList<String> noVowelList = new ArrayList<String>();
        for (int i = 0; i < text.length(); i++) {
            char elem = text.charAt(i);
            if (isVowel(elem))
                vowelList.add(Character.toString(elem));
            else {
                if (!Character.isSpaceChar(elem))
                    noVowelList.add(Character.toString(elem));
            }
        }
        //Option 1
        for (String elem : vowelList) {
            System.out.print(elem+" ");
        }
        System.out.println();
        for (String elem : noVowelList) {
            System.out.print(elem+" ");
        }
        //Option 2
        /*
        String salida = String.join(" ", vowelList);
        System.out.println(salida);
        salida = String.join(" ", noVowelList);
        System.out.println(salida);
        */
    }

    // The method checks whether a letter is a vowel
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // Convert to lowercase

        for (char d : vowels)   // Look for vowels in the array
        {
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}