import java .util.Scanner;
public class TwoDArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the 1st D length");
        int len1 = scan.nextInt();
        System.out.println("Enter the 2nd D length");
        int len2 = scan.nextInt();
        int arr[][] = new int[len1][len2];
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j<=arr[i].length - 1; j++) {
                System.out.println("Enter the marks of the class " + i + " Student of " + j);
                arr[i][j] = scan.nextInt();
            }

        }
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j<=arr[i].length - 1; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}