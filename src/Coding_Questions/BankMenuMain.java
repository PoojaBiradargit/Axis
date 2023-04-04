import java.util.Scanner;
//write a program to display indefinite menu for performing basic bank operations
class Menu{
    public void menuOfBank(){
    System.out.println("Bank Menu");
        System.out.println("--------------------------");
        System.out.println("Select your choice");
        System.out.println("--------------------------");
        System.out.println("1.Balance");
        System.out.println("2.Withdraw");
        System.out.println("3.Deposit");
        System.out.println("4.Transfer");
        System.out.println("5.Exit");
        System.out.println("Enter your choice:");
}
}
public class BankMenuMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu m = new Menu();
        m.menuOfBank();
    }
}
