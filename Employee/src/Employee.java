public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void increaseSalary (double percentage){
        this.salary += this.salary / 100 * percentage;
    }

    public String toString(){
        return id +
                ", " +
                name +
                ", " + salary;
    }
}
