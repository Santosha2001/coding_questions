package numbers;

public class ReverseNumber {
    public static void reverseNumber(int number) {
        int reversed = 0;
        while (number != 0) {
            reversed = reversed * 10 + number % 10;
            number = number / 10;
        }
        System.out.println("Reversed number: " + reversed);

    }

    public static void main(String[] args) {
        // Reverse a number
        reverseNumber(1234);
        reverseNumber(5678);
    }
}
