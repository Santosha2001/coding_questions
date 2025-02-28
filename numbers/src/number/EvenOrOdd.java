package number;

public class EvenOrOdd {

    public static void main(String[] args) {
        evenOrOdd(5);
        evenOrOdd(6);
    }

    public static void evenOrOdd(int number) {
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
