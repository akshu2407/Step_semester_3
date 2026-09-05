import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Assume number is prime
        boolean isPrime = true;

        // Check divisibility
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        // Print result
        System.out.println("Is the number " + number +
                " a Prime number? " + isPrime);
    }
}