package com.yogesh1.recursion;

public class findMissingValue {

    public static int missingV(int arr[]) {
        int n = arr.length + 1;

        int totalSum = n * (n + 1) / 2;

        int arrSum = 0;
        for (int num : arr) {
            arrSum += num;
        }
        return totalSum - arrSum;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 8, 9}; // missing 7

        System.out.println(missingV(arr));
    }
}