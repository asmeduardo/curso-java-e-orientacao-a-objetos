package program;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account account = null;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        char response = sc.next().charAt(0);

        if (response == 'n') {
            account = new Account(number, holder);
        } else {
            System.out.print("Enter initial deposit value: ");
            double initialDepositAmount = sc.nextDouble();

            account = new Account(number, holder, initialDepositAmount);
        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double amount = sc.nextDouble();
        account.deposit(amount);
        System.out.println("Updated account data:");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter the withdraw value: ");
        amount = sc.nextDouble();
        account.withdraw(amount);
        System.out.println("Updated account data:");
        System.out.println(account);

        sc.close();
    }
}
