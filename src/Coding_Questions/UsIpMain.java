import java.util.Scanner;
public class UsIpMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        System.out.println("age "+age);
        System.out.println("Enter your salary");
        double sal = scanner.nextDouble();
        System.out.println("salary "+sal);
        scanner.close();
    }
}
