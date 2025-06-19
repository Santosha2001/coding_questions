package com.numbers;

public class FactorialOfNumber {
    public static void main(String[] args) {
        factorialOfNumber(4);

        int factorialWithRecursion = factorialWithRecursion(3);
        System.out.println("Factorial using recursion is: " + factorialWithRecursion);
    }

    /**
     * This method calculates the factorial of a given number.
     *
     * @param number The number for which the factorial is to be calculated.
     */
    public static void factorialOfNumber(int number) {
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        }

        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    /**
     * This method calculates the factorial of a given number using recursion.
     *
     * @param number The number for which the factorial is to be calculated.
     * @return The factorial of the number.
     */
    public static int factorialWithRecursion(int number) {
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return -1;
        }
        if (number == 0 || number == 1) {
            return 1;
        }
        return number * factorialWithRecursion(number - 1);
    }
}
