public class Company extends Payer{
    private int employees;

    public Company(String name, double anualIncome, int employees) {
        super(name, anualIncome);
        this.employees = employees;
    }


    @Override
    public double tax() {
        double sum = 0;
        if(employees <= 10){
            sum += anualIncome * 0.16;
        } else {
            sum += anualIncome * 0.14;
        }
        return sum;
    }
}
