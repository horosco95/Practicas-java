package com.HermesDev.practicas.java.task.task08.task0827;

import java.util.Date;

/* 
Working with dates

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("JANUARY 1 2000"));
    }

    public static boolean isDateOdd(String date) {
        Date fechaActual = new Date(date);
        Date fechaInicio = new Date();

        fechaInicio.setMonth(0);
        fechaInicio.setYear(fechaActual.getYear());
        fechaInicio.setHours(0);
        fechaInicio.setMinutes(0);
        fechaInicio.setSeconds(0);
        fechaInicio.setDate(1);

        return (fechaActual.getTime()-fechaInicio.getTime())/(1000*60*60*24) % 2 != 0;
    }
}
