package calculator;

import java.util.Scanner;

public class CalculatorApp {

    public static void main(String[] args) {
        System.out.println("=== Simple Calculator (Maven Build Demo) ===");
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.print("Enter operation [add|sub|mul|div|q to quit]: ");
            String op = scanner.next();
            if (op.equalsIgnoreCase("q")) {
                break;
            }
            System.out.print("Enter first number: ");
            double a = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double b = scanner.nextDouble();

            double result;
            try {
                switch (op.toLowerCase()) {
                    case "add":  result = calc.add(a, b); break;
                    case "sub":  result = calc.subtract(a, b); break;
                    case "mul":  result = calc.multiply(a, b); break;
                    case "div":  result = calc.divide(a, b); break;
                    default:
                        System.out.println("Unknown operation: " + op);
                        continue;
                }
                System.out.printf("Result: %.6f%n", result);
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        System.out.println("Goodbye!");
        scanner.close();
    }
}
