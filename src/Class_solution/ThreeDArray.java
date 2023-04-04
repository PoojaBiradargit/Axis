import java.util.Scanner;

public class ThreeDArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the 1D length");
        float arr[][][] = new float[scan.nextInt()][][];
        System.out.println("Enter the 2D length for each 1D");
        for (int i=0; i<= arr.length-1; i++){
            System.out.println("Enter the 2D length for 1D "+i);
            int len = scan.nextInt();
            arr[i]=new float[len][];
        }
        System.out.println("Enter 3D length for each 1 and 2D");
        for (int i=0; i<= arr.length-1; i++){
            for (int j=0; j<= arr[i].length-1; j++){
                System.out.println("Enter the length of 3D fot 1D " +i+ " 2D "+j);
                int len1= scan.nextInt();
                arr[i][j]=new float[len1];
            }
        }
        for (int i=0; i<= arr.length-1; i++){
            for (int j=0; j<=arr[i].length-1; j++){
                for ( int k=0; k<=arr[i][j].length-1; k++){
                    System.out.println("Enter the height of the university "+i+ " college "+j+ "Student "+k);
                    arr[i][j][k] = scan.nextInt();
                }
            }
        }
        System.out.println("Array contents");
        for (int i=0; i<= arr.length-1; i++) {
            for (int j = 0; j <= arr[i].length - 1; j++) {
                for (int k = 0; k <= arr[i][j].length - 1; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
        }
    }
}