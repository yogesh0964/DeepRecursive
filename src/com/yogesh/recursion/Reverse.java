package com.yogesh.recursion;

public class Reverse {

    public static void rev(int n,int r){
        if(n==0){
            System.out.println(r);
            return;
        }
        rev(n/10,r*10+n%10);
    }


    public static void main(String [] args) {
        int n=2345;
        rev(n,0);
//        int r=0;
//        while(n!=0){
//            r=r*10+(n%10);
//            n=n/10;
////        }
//
//        System.out.println(r);
    }
}
