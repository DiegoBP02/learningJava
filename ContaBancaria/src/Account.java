public class Account {
    private int number;
    private String holder;
    private double deposit;
    private double balance;

    public Account() {}
    public Account(int number, String holder, double deposit) {
        this.number = number;
        this.holder = holder;
        this.balance += deposit;
    }
    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public void deposit (double value) {
        this.balance += value;
    }

    public void withdraw (double value){
        this.balance -= value + 5;
    }

    public String message () {
        return "Account " +
                number +
                ", Holder: " +
                holder +
                ", Balance: $ " +
                String.format("%.2f",balance);
    }
}
