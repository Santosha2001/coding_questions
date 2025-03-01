package numbers;

public class FactorialOfNumber {

    public static int factorial(int number) {
        int factorial = 1;
        if (number == 0) {
            return 1;
        }
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    // Recursive approach
    public static int factorialRecursive(int number) {
        if (number == 0) {
            return 1;
        }
        return number * factorialRecursive(number - 1);
    }

    public static void main(String[] args) {
        // Find the factorial of a number
        System.out.println(factorial(5));    // 120
        System.out.println(factorial(6));    // 3628800

        System.out.println(factorialRecursive(5));    // 120
    }
}
