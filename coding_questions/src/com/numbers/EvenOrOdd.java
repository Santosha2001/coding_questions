package com.numbers;

public class EvenOrOdd {
    public static void main(String[] args) {
        checkNumberEvenOrOdd(8);
    }

    /**
     * This method checks if a number is even or odd.
     *
     * @param number the number to check
     */
    public static void checkNumberEvenOrOdd(int number) {
        if (number % 2 == 0) {
            System.out.println("The number " + number + " is even.");
        } else {
            System.out.println("The number " + number + " is odd.");
        }
    }
}
