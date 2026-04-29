package com.yogesh.recursion;

import java.util.Scanner;

public class powAb {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Base : ");
        int a = sc.nextInt();

        System.out.println("Enter Exponents : ");
        int b = sc.nextInt();

        System.out.println(a + "Raised the Pow : " + b + " Is " + pow(a, b));
    }
    public  static int pow(int a,int b){

        if(b==0)return 1;
        int call =pow(a,b/2);
        if(b%2==0)return call*call;
        else return a*call*call;
    }

}
