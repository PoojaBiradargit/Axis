import java.util.Scanner;

public class OneArrayReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the array length");
        int arr[] = new int[scan.nextInt()];
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println("Enter the elements");
            arr[i] = scan.nextInt();
        }
        int arr2[] = new int[arr.length];
        int j = arr.length - 1;
        for (int i = 0; i <= arr.length - 1; i++) {
            arr2[j] = arr[i];
            j--;
        }
        System.out.println("Array 1 contents");
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Array 2 contents");
        for (int i = 0; i <= arr2.length - 1; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}