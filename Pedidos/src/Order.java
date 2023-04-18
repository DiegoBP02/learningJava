import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private LocalDateTime moment;
    private OrderStatus status;
    private List<OrderItem> orders = new ArrayList<>();

    public Order(LocalDateTime moment, OrderStatus status) {
        this.moment = moment;
        this.status = status;
    }

    public void addItem(OrderItem item){
        orders.add(item);
    }
    public void removeItem(OrderItem item){
        orders.remove(item);
    }

    public LocalDateTime getMoment() {
        return moment;
    }




    public double total(){
        double sum = 0;
        for(OrderItem o : orders){
            sum += o.subTotal();
        }
        return sum;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(OrderItem o : orders){
            sb.append("\n").append(o.toString());
        }
        return sb.toString();
    }
}
