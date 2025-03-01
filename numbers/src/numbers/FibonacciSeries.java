package numbers;

public class FibonacciSeries {

    public static void fibonacci(int number) {
        int firstNumber = 0;
        int secondNumber = 1;
        int nextNumber;

//        while (number < 0) {
//            System.out.print(firstNumber + "");
//            nextNumber = firstNumber + secondNumber;
//            firstNumber = secondNumber;
//            secondNumber = nextNumber;
//        }
        for (int i = 0; i < number; i++) {
            System.out.print(firstNumber + " ");
            nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
    }

    public static void main(String[] args) {
        // Generate Fibonacci series
        fibonacci(3);   // 0 1 1
        System.out.println();
        fibonacci(5);   // 0 1 1 2 3
    }
}
