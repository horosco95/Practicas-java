package com.HermesDev.practicas.java.task.task03.task0307;

/* 
Hello, StarCraft!

*/

public class Solution {
    public static void main(String[] args) {
        Zerg zerg1 = new Zerg();
        Zerg zerg2 = new Zerg();
        Zerg zerg3 = new Zerg();
        Zerg zerg4 = new Zerg();
        Zerg zerg5 = new Zerg();
        
        zerg1.name = "zerg1";
        zerg2.name = "zerg2";
        zerg3.name = "zerg3";
        zerg4.name = "zerg4";
        zerg5.name = "zerg5";
        
        Protoss p1 = new Protoss();
        Protoss p2 = new Protoss();
        Protoss p3 = new Protoss();
        
        p1.name = "p1";
        p2.name = "p2";
        p3.name = "p3";
        
        Terran t1 = new Terran();
        Terran t2 = new Terran();
        Terran t3 = new Terran();
        Terran t4 = new Terran();
        
        t1.name = "t1";
        t2.name = "t2";
        t3.name = "t3";
        t4.name = "t4";
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
