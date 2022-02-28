package atminterface;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount( 20000, "1234");
       
        BankAccount[] bankAccounts = {bankAccount1};
        Scanner scanner = new Scanner(System.in);
        Menu.welcome();
        String pin = scanner.nextLine();
        BankAccount currentBankAccount = Main.getBankAccountByPin(bankAccounts, pin);
        ATM.useATM(currentBankAccount);
    }
    
        public static BankAccount getBankAccountByPin(BankAccount[] bankAccounts, String pin) {
        for (BankAccount bankAccount : bankAccounts) {
            if (bankAccount.pin.equals(pin)) {
                return bankAccount;
                
            } else if (!bankAccount.pin.equals(pin) )
            {
                System.out.println("Wrong Pin. Try Again.");
            }
        }
        return null;
    }
}
