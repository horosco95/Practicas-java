package com.HermesDev.practicas.java.task.task09.task0918;

import java.io.IOException;
/* 
We're all friends here, even the exceptions

*/

public class Solution {
    public static void main(String[] args) {
    }
    //Checked exceptions:
    static class MyException extends NoSuchFieldException {
    }

    static class MyException2 extends IOException {
    }
    //Unchecked exceptions:
    static class MyException3 extends NullPointerException {
    }

    static class MyException4 extends IndexOutOfBoundsException {
    }
}

