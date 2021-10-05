package com.HermesDev.practicas.java.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

/* 
Kind Emma and the summer holidays

*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));
        map.put("Stone", df.parse("APRIL 9 1988"));
        map.put("Maquiavello", df.parse("MAY 23 1766"));
        map.put("Lorenz", df.parse("SEPTEMBER 18 1999"));
        map.put("Perez", df.parse("AUGUST 15 1994"));
        map.put("Chavez", df.parse("MAY 11 1978"));
        map.put("Hernandez", df.parse("MARCH 30 1995"));
        map.put("Fernandez", df.parse("JULY 15 1972"));
        map.put("Cortez", df.parse("OCTOBER 1 1999"));
        map.put("Trump", df.parse("DECEMBER 8 2001"));
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        Date fechaInicio = new Date();
        fechaInicio.setMonth(5);
        fechaInicio.setDate(1);
        fechaInicio.setHours(0);
        fechaInicio.setMinutes(0);
        fechaInicio.setSeconds(0);
        
        Date fechaFin = new Date();
        fechaFin.setHours(0);
        fechaFin.setMinutes(0);
        fechaFin.setSeconds(0);
        fechaFin.setMonth(7);
        fechaFin.setDate(31);

        map.values().removeIf((elem)->
                elem.getMonth() >= fechaInicio.getMonth() &&
                elem.getMonth() <= fechaFin.getMonth());
    }

    public static void main(String[] args) {

    }
}
