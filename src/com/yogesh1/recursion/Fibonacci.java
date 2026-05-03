package com.yogesh1.recursion;

public class Fibonacci {

    public static int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int n = 6;

        for (int i = 2; i <= n; i++) {
            int a = fib(i - 2);
            int b = fib(i - 1);
            int c = fib(i);

            System.out.println("F(" + i + ") = " + c + " (" + a + " + " + b + ")");
        }
    }
}