import java.util.Scanner;
public class SearchElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array length");
        int[]arr = new int[scan.nextInt()];
        System.out.println("Enter array contents");
        for (int i=0;i<= arr.length-1; i++){
            System.out.println("Enter the elements");
            arr[i]= scan.nextInt();
        }
        System.out.println("Enter the key to search");
        int key = scan.nextInt();
        for (int i=0; i<= arr.length-1; i++){
            if (key == arr[i]){
                System.out.println("Key found at the index "+ i);
                System.exit(0);
            }
        }
        System.out.println("Key not found");
    }
}