import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Store original number
        int origNumber = number;

        // Initially reversed number is 0
        int reversedNumber = 0;

        // Reverse the number
        while (number != 0) {

            // Get last digit
            int digit = number % 10;

            // Build reversed number
            reversedNumber = reversedNumber * 10 + digit;

            // Remove last digit
            number = number / 10;
        }

        // Compare original and reversed number
        if (reversedNumber == origNumber) {
            System.out.println("Is the number " + origNumber +
                    " a Palindrome? true");
        } else {
            System.out.println("Is the number " + origNumber +
                    " a Palindrome? false");
        }
    }
}