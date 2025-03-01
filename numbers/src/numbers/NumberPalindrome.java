package numbers;

public class NumberPalindrome {
    public static void isPalindrome(int number) {
        int reversed = 0;
        int originalNumber = number;
        while (number != 0) {
            reversed = reversed * 10 + number % 10;
            number = number / 10;
        }
        if (originalNumber == reversed) {
            System.out.println(reversed + " is a Palindrome");
        } else {
            System.out.println(reversed + " is not a palindrome");
        }
    }

    public static void main(String[] args) {
        // Check if a number is a palindrome
        isPalindrome(12321);    // Palindrome
        isPalindrome(12345);    // Not a palindrome
    }
}
