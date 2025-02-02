package com;
//VALID PARENTHESIS

import java.util.*;
public class Valid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string of parentheses : ");
        String str = scanner.nextLine();
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            else 
            {
                if (stack.isEmpty()) 
                {
                    System.out.println("Invalid");
                    scanner.close();
                    return;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
                    System.out.println("Invalid");
                    scanner.close();
                    return;
                }
            }
        }

        System.out.println(stack.isEmpty() ? "Valid" : "Invalid");
        scanner.close();
    }
}

