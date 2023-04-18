import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        String date = sc.nextLine();
        LocalDate birthDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        Client client = new Client(name,email,birthDate);
        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        String status = sc.nextLine();
        System.out.print("How many items for this order? ");
        int n = sc.nextInt();
        LocalDateTime currentDateTime = LocalDateTime.now();
        Order order = new Order(currentDateTime, OrderStatus.valueOf(status));
        client.setClientOrder(order);
        for(int i = 0; i<n; i++){
            System.out.println("Enter #" + (i + 1) + " item data:");
            System.out.print("Product name: ");
            String productName = sc.next();
            sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            Product product = new Product(productName,productPrice);
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            OrderItem orderItem = new OrderItem(quantity, product);
            client.getClientOrder().addItem(orderItem);
        }

        System.out.println();
        System.out.println("ORDER SUMMARY:");
        String formattedMoment = client.getClientOrder().getMoment().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        System.out.println("Order moment: " + formattedMoment);
        System.out.println("Order status: " + OrderStatus.valueOf(status));
        System.out.println("Client: " + client.getName() + " (" + client.getBirthDate() + ")" + " - " + client.getEmail());
        System.out.print("Order Items:");
        System.out.println(client.getClientOrder().toString());
        System.out.println("Total price: " + client.getClientOrder().total());

        sc.close();

    }
}