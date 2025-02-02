package com;

import java.util.Optional;

public class OptinalExample {
    public static void main(String[] args) 
    {
        Optional<String> optionalName = Optional.of("Meghashyam");
        System.out.println("Name: " + optionalName.get());

        Optional<String> nullableOptional = Optional.ofNullable(null);

        if (nullableOptional.isPresent()) {
            System.out.println("Nullable Optional contains: " + nullableOptional.get());
        } else {
            System.out.println("Nullable Optional is empty.");
        }

        String defaultValue = nullableOptional.orElse("Default Name");
        System.out.println("Default Name: " + defaultValue);

        optionalName.ifPresent(name -> System.out.println("Action on Name: " + name.toUpperCase()));
        try {
            String value = nullableOptional.orElseThrow(() -> new IllegalArgumentException("Value is missing!"));
            System.out.println("Value: " + value);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
