
import java.util.Scanner;

public class A1 {

    static int[] productExceptSelf(int[] nums) {

        int[] answer = new int[nums.length];

        int left = 1;

        for (int i = 0; i < nums.length; i++) {
            answer[i] = left;
            left = left * nums[i];
        }

        int right = 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            answer[i] = answer[i] * right;
            right = right * nums[i];
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] nums = new int[4];

        System.out.println("Enter 4 numbers:");

        for (int i = 0; i < 4; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = productExceptSelf(nums);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}

