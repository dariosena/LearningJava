package bank.version_4;

public class BankAccount {
  private int acctnum;
  private int balance = 0;
  private double rate = 0.01;
  private boolean isforeign = false;

  public BankAccount(int a) {
    acctnum = a;
  }

  public int getAcctNum() {
    return acctnum;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int amt) {
    balance = amt;
  }

  public boolean isForeign() {
    return isforeign;
  }

  public void setForeign(boolean b) {
    isforeign = b;
  }

  public boolean hasEnoughCollateral(int amt) {
    return balance >= amt / 2;
  }

  public void deposit(int amt) {
    balance += amt;
  }

  public String toString() {
    return "Bank account " + acctnum + ": balance=" + balance + ", is "
        + (isforeign ? "foreign" : "domestic");
  }

  public void addInterest() {
    balance += (int) (balance * rate);
  }
}
