package com;
//VOWEL AND CONSONANT COUNTER

public class Vowel {
    public static void main(String[] args) {
        String str = "Hello World!";
        str = str.toLowerCase();

        int vowels = 0, consonants = 0;

        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                switch (ch) {
                    case 'a', 'e', 'i', 'o', 'u' -> vowels++;
                    default -> consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
