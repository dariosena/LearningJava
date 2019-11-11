package howtoprogram;

// Fig. 3.1: Account.java
// Account class that contains a name instance variable
// and a method to set and get its value

public class Account {

    private String name; // instance variable
    private double balance; // instance variable

    // constructor initializes name with a parameter name
    // constructor name is class name
    public Account(String name, double balance) {
        this.name = name;
        // validate that the balance is greater than 0.0; if it's not,
        // instance variable balance keeps its default initial value of 0.0
        if (balance > 0.0) {
            this.balance = balance;
        }
    }

    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) {
            balance = balance + depositAmount; // add it to the balance
        }
    }

    public double getBalance() {
        return balance;
    }

    // method to set the name in the object
    public void setName(String name) {
        this.name = name; // store the name
    }

    // method to retrieve the name from the object
    public String getName() {
        return this.name; // return value of name to caller
    }
} // end class Account
