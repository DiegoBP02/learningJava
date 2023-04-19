import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Payer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++){
            System.out.println("Tax payer #" + (i + 1) + " data: ");
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual Income: ");
            int anualIncome = sc.nextInt();
            switch (ch){
                case 'i' -> {
                    System.out.print("Heath expenditures: ");
                    double healthCare = sc.nextDouble();
                    list.add(new Individual(name,anualIncome,healthCare));
                }
                case 'c' -> {
                    System.out.print("Number of employees: ");
                    int employees = sc.nextInt();
                    list.add(new Company(name,anualIncome,employees));
                }
            }
        }

        System.out.println("TAXES PAID:");
        double totalTaxes = 0;
        for(Payer p : list){
            System.out.println(
                    p.getName() +
                            ": $ " +
                            String.format("%.2f", p.tax())
            );
            totalTaxes += p.tax();

        }
        System.out.println("TOTAL TAXES : " + totalTaxes);

        sc.close();

    }
}