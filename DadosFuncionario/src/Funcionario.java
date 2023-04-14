public class Funcionario {
    String name;
    double grossSalary;
    double tax;

    public double NetSalary() {
        return grossSalary - tax;
    }

    public void IncreaseSalary(double percentage) {
        this.grossSalary = grossSalary + ((grossSalary / 100) * percentage);
    }


    public String message() {
        return "Employee: " + name + ", $ " + NetSalary() ;
    }

    public String updatedMessage() {
        return "Updated data: " + name + ", $ " + NetSalary() ;
    }
}