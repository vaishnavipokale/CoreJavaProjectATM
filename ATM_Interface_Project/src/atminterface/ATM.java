package atminterface;

import java.util.Scanner;

public class ATM {
    public static void useATM(BankAccount bankAccount) {
        Scanner scanner = new Scanner(System.in);
        char option = '\0';
        do {
            Menu.showMenu();
            option = scanner.next().charAt(0);
            switch (option) {
                case '1':
                    System.out.println(bankAccount.getBalance());
                    break;
                case '2':
                    System.out.println("Enter an amount to deposit: ");
                    int amountToDeposit = scanner.nextInt();
                    bankAccount.deposit(amountToDeposit);
                    
                    break;
                case '3':
                    System.out.println("Enter an amount to withdraw: ");
                    int amountToWithdraw = scanner.nextInt();
                    bankAccount.withdraw(amountToWithdraw);
                    break;
                case '4':
                    System.out.println("The transaction is over. ");
                    break;
                default:
                    System.out.println("Not a valid option. Choose another option.");
                    break;
            }
        } while (option != '5');
    }
}