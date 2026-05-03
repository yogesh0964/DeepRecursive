package com.yogesh1.recursion;

public class printNto10 {

    public static void printN(int n) {
        if (n == 0) return;
        printN(n - 1);
        System.out.print(n + " ");
//        printN(n - 1);
    }

    public static void main(String[] args) {
        int n = 10;
        printN(n);
    }
}