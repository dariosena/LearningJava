public class Account {
    int number;
    double balance;
    double limit;
    String holder;

    public boolean withdraw(double value) {
        this.balance -= value;
        return true;
    }

    void deposit(double value) {
        this.balance += value;
    }
}
