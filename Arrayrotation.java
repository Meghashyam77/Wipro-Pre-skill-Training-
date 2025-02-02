package com;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayrotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the array elements separated by spaces: ");
        String[] input = scanner.nextLine().split(" ");
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) 
        {
            arr[i] = Integer.parseInt(input[i]);
        }
        System.out.print("Enter the number of rotations: ");
        int n = scanner.nextInt();
        System.out.print("Enter rotation direction (right/left): ");
        String direction = scanner.next();
        boolean isRight = direction.equalsIgnoreCase("right");
        int length = arr.length;
        n %= length;
        if (!isRight) n = length - n;
        int[] rotated = new int[length];
        for (int i = 0; i < length; i++) {
            rotated[(i + n) % length] = arr[i];
        }

        System.out.println("Rotated Array: " + Arrays.toString(rotated));

        scanner.close();
    }
}
