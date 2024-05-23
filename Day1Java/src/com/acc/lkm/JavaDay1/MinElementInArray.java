package com.acc.lkm.JavaDay1;

public class MinElementInArray {
    
    public static int findMin(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty or null");
        }
        
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    
    public static void main(String[] args) {
        int[] numbers = {5, 3, 9, 1, 7};
        int min = findMin(numbers);
        System.out.println("Minimum element in the array is: " + min);
    }
}
