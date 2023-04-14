import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        System.out.print("Name: ");
        funcionario.name =  sc.next();

        System.out.print("Gross salary: ");
        funcionario.grossSalary =  sc.nextDouble();

        System.out.print("Tax: ");
        funcionario.tax =  sc.nextDouble();

        System.out.println(funcionario.message());

        System.out.println();
        System.out.println("Which percentage to increase salary?");
        double percentage = sc.nextDouble();
        funcionario.IncreaseSalary(percentage);

        System.out.println(funcionario.updatedMessage());

        sc.close();
        }
}