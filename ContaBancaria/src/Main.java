import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String accountHolder = sc.nextLine();
        System.out.print("Is there an initial deposit? (y/n) ");
        String showInitialDeposit = sc.next();
        if(showInitialDeposit.equals("y")){
            System.out.print("Enter initial deposit value: ");
            double depositValue = sc.nextDouble();
            account = new Account(accountNumber,accountHolder,depositValue);
        } else {
            account = new Account(accountNumber,accountHolder);
        }
        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account.message());

        System.out.println();
        System.out.println("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println("Updated account data: ");
        System.out.println(account.message());

        System.out.println();
        System.out.println("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println("Updated account data: ");
        System.out.println(account.message());

        sc.close();
    }
}