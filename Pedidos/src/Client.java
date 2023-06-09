import java.time.LocalDate;
import java.util.Date;

public class Client {
    private String name;
    private String email;
    private LocalDate birthDate;
    private Order clientOrder;

    public String getName() {
        return name;
    }


    public String getEmail() {
        return email;
    }


    public LocalDate getBirthDate() {
        return birthDate;
    }


    public Client(String name, String email, LocalDate birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    public void setClientOrder(Order clientOrder) {
        this.clientOrder = clientOrder;
    }

    public Order getClientOrder() {
        return clientOrder;
    }
}
