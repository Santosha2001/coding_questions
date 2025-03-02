package numbers;

public class PrimeCheck {

    public static void isPrime(int number) {
        if (number <= 1) return;

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.println(number + " is not prime");
                return;
            }
        }
        System.out.println(number + " is prime");
    }

    public static void main(String[] args) {
        // Check if a number is prime
        isPrime(13);     // Prime
        isPrime(10);    // Not prime
    }
}
