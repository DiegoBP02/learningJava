import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            System.out.println("Product #" + (i + 1) + " data: ");
            System.out.print("Common, used or imported (c/u/i)? ");
            String c = sc.next();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            switch (c) {
                case "c" -> list.add(new Product(name, price));
                case "u" -> {
                    System.out.print("Manufacture date (DD/MM/YYYY): ");
                    String date = sc.next();
                    LocalDate manufactureDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                    list.add(new UsedProduct(name, price, manufactureDate));
                }
                case "i" -> {
                    System.out.print("Customs fee: ");
                    double customsFee = sc.nextDouble();
                    list.add(new ImportedProduct(name, price, customsFee));
                }
            }
        }

        System.out.println("PRICE TAGS:");
        for(Product p : list){
            System.out.println(p.priceTag());
        }

        sc.close();
    }
}