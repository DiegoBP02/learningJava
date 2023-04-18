import java.time.LocalDate;

public class UsedProduct extends Product{
    private LocalDate manufactureDate;

    public UsedProduct(String name, double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag(){
        return this.name +
                " (used) $ " +
                this.price +
                " Manufacture date: " +
                this.manufactureDate +
                ")";
    }
}
