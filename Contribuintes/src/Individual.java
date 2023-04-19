public class Individual extends Payer{
    private double healthCare;

    public Individual(String name, double anualIncome, double healthCare) {
        super(name, anualIncome);
        this.healthCare = healthCare;
    }

    @Override
    public double tax() {
        double sum = 0;
        if(anualIncome < 20000){
            sum += anualIncome * 0.15;
        } else {
            sum += anualIncome * 0.25;
        }
        if(healthCare != 0){
            sum -= healthCare * 0.5;
        }
        return sum;
    }
}
