import java.util.Scanner;

public class L4 {

    static int[] mergeSortedArrays(int[] arr1, int[] arr2) {

        int[] result = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] < arr2[j]) {
                result[k] = arr1[i];
                i++;
            } else {
                result[k] = arr2[j];
                j++;
            }

            k++;
        }

        while (i < arr1.length) {
            result[k] = arr1[i];
            i++;
            k++;
        }

        while (j < arr2.length) {
            result[k] = arr2[j];
            j++;
            k++;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr1 = new int[3];
        int[] arr2 = new int[3];

        System.out.println("Enter 3 elements for arr1:");

        for (int i = 0; i < 3; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter 3 elements for arr2:");

        for (int i = 0; i < 3; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] result = mergeSortedArrays(arr1, arr2);

        System.out.println("Merged array:");

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}
