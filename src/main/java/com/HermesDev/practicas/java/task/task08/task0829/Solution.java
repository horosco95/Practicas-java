package com.HermesDev.practicas.java.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Software update

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // List of addresses
        HashMap<String,String> addresses = new HashMap<>();
        while (true) {
            String city = reader.readLine();
            if (city.isEmpty()) {
                break;
            }
            //String family = reader.readLine();
            addresses.put(reader.readLine(),city);
        }

        // Read the city
        String citySearch = reader.readLine();

        if (addresses.containsValue(citySearch)) {
            for (Map.Entry family : addresses.entrySet()) {
                if (family.getValue().equals(citySearch))
                    System.out.println(family.getKey());
            }
        }
    }
}
