package numbers;

public class SumOfDigits {

    public static int sumOfDigits(int number) {
        int sum = 0;
        if (number == 0) return 0;
        while ((number != 0)) {
            int digit = number % 10;
            sum += digit;
            number = number / 10;

        }
        return sum;
    }

    public static void main(String[] args) {
        // Find the sum of digits of a number
        System.out.println(sumOfDigits(123));    // 6
        System.out.println(sumOfDigits(456));    // 15
    }
}
