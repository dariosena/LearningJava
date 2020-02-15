package bank.version_4;

import java.util.HashMap;

// mediator
public class Bank {
  private HashMap<Integer, BankAccount> accounts = new HashMap<>();
  private int nextacct;

  public Bank(HashMap<Integer, BankAccount> accounts, int n) {
    this.accounts = accounts;
    this.nextacct = n;
  }

  public int newAccount(boolean isforeign) {
    int acctnum = nextacct++;
    BankAccount ba = new BankAccount(acctnum);
    ba.setForeign(isforeign);
    accounts.put(acctnum, ba);
    return acctnum;
  }

  public int getBalance(int acctnum) {
    BankAccount ba = accounts.get(acctnum);
    return ba.getBalance();
  }

  public void setBalance(int acctnum, int amt) {
    BankAccount ba = accounts.get(acctnum);
    int balance = ba.getBalance();
    ba.setBalance(balance + amt);
  }

  public void deposit(int acctnum, int amt) {
    BankAccount ba = accounts.get(acctnum);
    ba.deposit(amt);
  }

  public void setForeign(int acctnum, boolean isforeign) {
    BankAccount ba = accounts.get(acctnum);
    ba.setForeign(isforeign);
  }

  public boolean authorizeLoan(int acctnum, int loanamt) {
    BankAccount ba = accounts.get(acctnum);
    return ba.hasEnoughCollateral(loanamt);
  }

  public String toString() {
    String result = "The bank has " + accounts.size() + " accounts.";
    for (BankAccount ba : accounts.values())
      result += "\n\t" + ba.toString();
    return result;
  }

  public void addInterest() {
    for (BankAccount ba : accounts.values())
      ba.addInterest();
  }
}
