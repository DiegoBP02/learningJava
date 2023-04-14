import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price?");
        double price = sc.nextDouble();
        System.out.println("How many dollars will be bought?");
        double dollars = sc.nextDouble();
        System.out.println("Amount to be paid in reais = " + CurrencyConverter.converter(price,dollars));


        sc.close();
    }
}