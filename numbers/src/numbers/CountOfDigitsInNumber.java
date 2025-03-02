package numbers;

public class CountOfDigitsInNumber {

    public static int digitCount(int number) {
        int count = 0;
        if (number == 0) return 1;
        if (number < 0) number = -number;

        while (number != 0) {
            number = number / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        // Count the number of digits in a number
        System.out.println(digitCount(1234));    // 4
        System.out.println(digitCount(5678));    // 4
        System.out.println(digitCount(0));    // 1
        System.out.println(digitCount(-1234));    // 4
    }
}
