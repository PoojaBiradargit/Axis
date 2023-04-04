import java.util.Scanner;

public class TwoDJagged {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the 1st D length");
        int [][]arr = new int[scan.nextInt()][];
        System.out.println("Enter 2nd D length for each 1st D");
        for (int i=0; i<= arr.length-1; i++){
            System.out.println("Enter the 2nd D length for 1D "+i);
            int len = scan.nextInt();
            arr[i]=new int[len];
        }
        for (int i=0; i<= arr.length-1; i++){
            for (int j=0; j<=arr[i].length-1; j++){
                System.out.println("Enter the age of the class " +i+ " Student of "+j);
                arr[i][j]=scan.nextInt();
            }
        }
        System.out.println("Array contents");
        for (int i=0; i<= arr.length-1; i++){
            for (int j=0; j<= arr[i].length-1; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}