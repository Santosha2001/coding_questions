package com.numbers;

public class FibonacciSeries {

    /**
     * This method prints the Fibonacci series up to a given number.
     *
     * @param number The number of terms in the Fibonacci series to be printed.
     */
    public static void fibonacciSeries(int number) {
        int firstNumber = 0, secondNumber = 1, nextNumber;
        for (int i = 0; i <= number; i++) {
            nextNumber = firstNumber + secondNumber;
            System.out.print(firstNumber + ", ");
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
    }

    /**
     * This method calculates the Fibonacci number at a given position using recursion.
     *
     * @param number The position in the Fibonacci series.
     * @return The Fibonacci number at the given position.
     */
    public static int fibonacciSeriesWithRecursion(int number) {
        if (number <= 1) {
            return number;
        }
        return fibonacciSeriesWithRecursion(number - 1) + fibonacciSeriesWithRecursion(number - 2);
    }

    public static void main(String[] args) {
        fibonacciSeries(3);
        int fibonacciWithRecursion = fibonacciSeriesWithRecursion(3);
        System.out.println("\nFibonacci series using recursion is: " + fibonacciWithRecursion);
    }
}
