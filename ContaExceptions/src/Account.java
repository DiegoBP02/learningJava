public class Account {
    private int number;
    private String holder;
    private double balance;
    private double withdrawLimit;

    public Account(int number, String holder, double balance, double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    private void deposit (double amount){
        this.balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw (double amount){
        if(amount > withdrawLimit){
            throw new DomainException("Withdraw error: The amount exceeds withdraw limit");
        }
        if (this.balance - amount < 0){
            throw new DomainException("Withdraw error: Not enough balance");
        }
        this.balance -= amount;
    }
}
