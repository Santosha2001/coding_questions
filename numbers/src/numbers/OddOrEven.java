package numbers;

public class OddOrEven {
    public static void main(String[] args) {
        // Check if a number is odd or even
        oddOrEven(5);
        oddOrEven(10);
    }

    public static void oddOrEven(int num) {
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
