package string;

public class ReverseString {

    // Reverse a string
    public static void reverseString(String input) {
        String original = input;
        String reverse = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reverse = reverse + input.charAt(i);
        }
        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reverse);
    }

    public static String reverseStringWithCharArray(String input) {
        char[] inputCharArray = input.toCharArray();
        int left = 0;
        int right = inputCharArray.length - 1;

        while (left < right) {
            char temp = inputCharArray[left];
            inputCharArray[left] = inputCharArray[right];
            inputCharArray[right] = temp;
            left++;
            right--;
        }
        return new String(inputCharArray);
    }

    public static void main(String[] args) {
        reverseString("Hello World");

        String input = "Hello World";
        String reversedString = reverseStringWithCharArray(input);
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversedString);
    }
}
