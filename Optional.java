package com;
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> optionalName = Optional.of("Meghashyam");
        System.out.println("Name: " + optionalName.get()); // Get the value

        // 2. Create an Optional that may hold null
        Optional<String> nullableOptional = Optional.ofNullable(null);

        // 3. Check if a value is present
        if (nullableOptional.isPresent()) {
            System.out.println("Nullable Optional contains: " + nullableOptional.get());
        } else {
            System.out.println("Nullable Optional is empty.");
        }

        // 4. Provide a default value if the Optional is empty
        String defaultValue = nullableOptional.orElse("Default Name");
        System.out.println("Default Name: " + defaultValue);

        // 5. Perform an action only if the value is present
        optionalName.ifPresent(name -> System.out.println("Action on Name: " + name.toUpperCase()));

        // 6. Throw an exception if the value is absent
        try {
            String value = nullableOptional.orElseThrow(() -> new IllegalArgumentException("Value is missing!"));
            System.out.println("Value: " + value);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
