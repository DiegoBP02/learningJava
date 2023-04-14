import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();
        int id;
        String name;
        double salary;
        for(int i =  0; i < n; i++){
            System.out.println();
            System.out.println("Employee #" + (i + 1) + ":");
            sc.nextLine();
            System.out.print("Id: ");
            id = sc.nextInt();
            System.out.print("Name: ");
            name = sc.next();
            sc.nextLine();
            System.out.print("Salary: ");
            salary = sc.nextDouble();
            list.add(new Employee(id,name,salary));
        }

        System.out.println();
        System.out.print("Enter employee id that will have salary increase: ");
        int employeeId = sc.nextInt();
        Employee employee = list.stream().filter(x -> x.getId() == employeeId).findFirst().orElse(null);
        if (employee != null){
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            employee.increaseSalary(percentage);
        } else {
            System.out.println("This id does not exist!");
        }

        System.out.println();
        System.out.println("List of employees:");
        for(Employee emp : list){
            System.out.println(emp.toString());
        }

        sc.close();

    }
}