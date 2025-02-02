package com;

//Array element comparison

public class Hello {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 5, 2};

        if (arr1.length != arr2.length) {
            System.out.println("Arrays are of different sizes");
            return;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == arr2[i]) {
                System.out.println("Element " + i + ": Equal");
            } else if (arr1[i] > arr2[i]) {
                System.out.println("Element " + i + ": Greater");
            } else {
                System.out.println("Element " + i + ": Lesser");
            }
        }
    }
}



