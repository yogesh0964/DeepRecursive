package com.yogesh.recursion;

public class naturalNumberSum {

    public static int findSum(int n){
        if(n==1) return 1;
        return n+findSum(n-1);
    }

    public static void main(String[] args) {
        int n=5;
        System.out.print(findSum(n));
//        int l = 0;
//        int m = 1;
//        int n = 10;
//        while (l <n) {
//            l += m;
//            System.out.println(m);
//            m = l;
//        }
    }
}