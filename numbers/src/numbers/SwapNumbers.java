package numbers;

public class SwapNumbers {

    public static void swapNumbersWithoutThirdVariable(int num1, int num2) {
        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);

    }

    public static void main(String[] args) {
        // Swap two numbers without using a third variable
        swapNumbersWithoutThirdVariable(10, 20);
        swapNumbersWithoutThirdVariable(100, 200);
    }
}
