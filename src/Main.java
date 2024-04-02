import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter account number:");
        String accountNumber = scanner.nextLine();

        System.out.println("Enter owner name:");
        String name = scanner.nextLine();

        System.out.println("Enter initial balance:");
        Double initialBalance = scanner.nextDouble();


        BankAccount myAccount = new BankAccount(accountNumber, initialBalance, name);

        System.out.println("Enter deposit amount:");
        Double depositAmount = scanner.nextDouble();
        myAccount.deposit(depositAmount);

        System.out.println("Enter withdrawal amount:");
        Double withdrawAmount = scanner.nextDouble();
        myAccount.withdraw(withdrawAmount);

        System.out.println("Current balance: $" + myAccount.getBalance());

        scanner.close();
    }
}