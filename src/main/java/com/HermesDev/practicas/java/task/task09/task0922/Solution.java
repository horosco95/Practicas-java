package com.HermesDev.practicas.java.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
What's today's date?

*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //Obtengo patron ingresado
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaIngresada = formato.parse(reader.readLine());
        //Formateo fecha hacia consola
        DateFormat fechaSalida = SimpleDateFormat.getDateInstance(2, Locale.ENGLISH);
        System.out.println(fechaSalida.format(fechaIngresada).toUpperCase());
    }
}
