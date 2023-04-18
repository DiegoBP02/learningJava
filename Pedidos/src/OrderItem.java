public class OrderItem {

    private int quantity;
    private double price;
    private Product product;

    public OrderItem(int quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
        this.price = product.getPrice();
    }

    public double subTotal(){
        return this.price * this.quantity;
    }

    public String toString(){
        return this.product.getName() +
                ", $" +
                this.product.getPrice() +
                ", Quantity: " +
                this.quantity +
                ", Subtotal: $" +
                this.subTotal();

    }
}
