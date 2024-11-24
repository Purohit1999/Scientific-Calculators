import java.util.Scanner;
/*
 * MIT License
 * Copyright (c) 2024 Purohit1999
 */

public class EnhancedScientificCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("====== Enhanced Scientific Calculator ======");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Square Root");
        System.out.println("6. Power");
        System.out.println("7. Modulus");
        System.out.println("8. Factorial");
        System.out.println("9. Exit");
        System.out.println("===========================================");

        // Prompt user for their choice
        while (true) {
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            // Variable declaration for calculations
            double num1, num2, result;

            switch (choice) {
                case 1:
                    // Addition
                    System.out.print("Enter the first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    num2 = scanner.nextDouble();
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;

                case 2:
                    // Subtraction
                    System.out.print("Enter the first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    num2 = scanner.nextDouble();
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;

                case 3:
                    // Multiplication
                    System.out.print("Enter the first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    num2 = scanner.nextDouble();
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;

                case 4:
                    // Division
                    System.out.print("Enter the dividend: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the divisor: ");
                    num2 = scanner.nextDouble();
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;

                case 5:
                    // Square Root
                    System.out.print("Enter a number: ");
                    num1 = scanner.nextDouble();
                    if (num1 >= 0) {
                        result = Math.sqrt(num1);
                        System.out.println("Square root: " + result);
                    } else {
                        System.out.println("Error: Cannot calculate square root of a negative number.");
                    }
                    break;

                case 6:
                    // Power
                    System.out.print("Enter the base: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the exponent: ");
                    num2 = scanner.nextDouble();
                    result = Math.pow(num1, num2);
                    System.out.println("Result: " + result);
                    break;

                case 7:
                    // Modulus
                    System.out.print("Enter the first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    num2 = scanner.nextDouble();
                    if (num2 != 0) {
                        result = num1 % num2;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;

                case 8:
                    // Factorial
                    System.out.print("Enter a positive integer: ");
                    int number = scanner.nextInt();
                    if (number >= 0) {
                        System.out.println("Factorial: " + factorial(number));
                    } else {
                        System.out.println("Error: Factorial of a negative number is not defined.");
                    }
                    break;

                case 9:
                    // Exit the program
                    System.out.println("Exiting the calculator. Thank you!");
                    scanner.close();
                    return;

                default:
                    // Invalid choice
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    /**
     * Method to calculate factorial of a number
     *
     * @param n The number for which factorial is to be calculated
     * @return The factorial of the number
     */
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}

