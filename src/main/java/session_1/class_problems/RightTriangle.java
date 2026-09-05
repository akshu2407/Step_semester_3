import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get number of rows
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        // Outer loop → rows
        for (int i = 1; i <= rows; i++) {

            // Inner loop → stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Move to next line
            System.out.println();
        }
    }
}