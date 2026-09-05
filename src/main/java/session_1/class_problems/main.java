import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int origNumber = number;
        int sum = 0;

        while (number != 0) {

            // Get last digit
            int digit = number % 10;

            // Add cube of digit
            sum = sum + digit * digit * digit;

            // Remove last digit
            number = number / 10;
        }

        // Compare sum with original number
        if (sum == origNumber) {
            System.out.println("Is the number " + origNumber
                    + " an Armstrong number? true");
        } else {
            System.out.println("Is the number " + origNumber
                    + " an Armstrong number? false");
        }
    }
}
