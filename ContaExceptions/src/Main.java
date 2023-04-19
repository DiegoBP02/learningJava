import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.print("Holder: ");
            String holder = sc.next();
            sc.nextLine();
            System.out.print("Initial Balance: ");
            double initialBalance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();
            Account account = new Account(number,holder,initialBalance,withdrawLimit);
            System.out.print("Enter amount for withdraw: ");
            double amount = sc.nextDouble();
            account.withdraw(amount);
            System.out.println("New balance: " + account.getBalance());
        } catch (DomainException e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Unexpected error");
        }

        sc.close();

    }
}