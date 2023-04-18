public class ImportedProduct extends Product {
    private double customFee;
    public ImportedProduct(String name, double price, double customFee) {
        super(name, price);
        this.customFee = customFee;
    }

    public double totalPrice(){
        return this.price + this.customFee;
    }

    @Override
    public String priceTag(){
        return this.name +
                " $ " +
                this.totalPrice() +
                " (Custom fee: $ " +
                this.customFee +
                ")";
    }
}
