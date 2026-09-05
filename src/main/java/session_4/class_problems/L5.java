import java.util.Scanner;

public class L5 {

    static int[] rotateArray(int[] nums, int k) {

        k = k % nums.length;

        int[] newArray = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            newArray[(i + k) % nums.length] = nums[i];
        }

        return newArray;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] nums = new int[7];

        System.out.println("Enter 7 elements:");

        for (int i = 0; i < 7; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter k:");
        int k = sc.nextInt();

        int[] result = rotateArray(nums, k);

        System.out.println("Rotated array:");

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}