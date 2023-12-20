package pl.pingwit.lec_24.point_6;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        // Example 1: Using a Lambda Expression
        Supplier<String> greetingSupplier = () -> "Hello, World!";
        String greeting = greetingSupplier.get();
        System.out.println(greeting);

        // Example 2: Using a Method Reference
        Supplier<Double> randomDoubleSupplier = Math::random;
        double randomValue = randomDoubleSupplier.get();
        System.out.println("Random value: " + randomValue);

        // Example 3: Using a Custom Supplier
        Supplier<String> customSupplier = () -> generateGreeting("John");
        String customGreeting = customSupplier.get();
        System.out.println(customGreeting);
    }

    // Custom method to generate a greeting
    private static String generateGreeting(String name) {
        return "Hello, " + name + "!";
    }
}
