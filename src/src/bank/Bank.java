package bank;

import java.util.HashMap;
import java.util.Set;

public class Bank {

  private HashMap<Integer, Integer> accounts = new HashMap<Integer, Integer>();

  private double rate = 0.01;
  private int nextacct = 0;

  public int newAccount() {
    int acctnum = nextacct++;
    accounts.put(acctnum, 0);
    return acctnum;
  }

  public int getBalance(int acctnum) {
    return accounts.get(acctnum);
  }

  public void deposit(int acctnum, int amt) {
    int balance = accounts.get(acctnum);
    accounts.put(acctnum, balance + amt);
  }

  public boolean authorizeLoan(int acctnum, int loanamt) {
    int balance = accounts.get(acctnum);
    return balance >= loanamt / 2;
  }

  public void addInterest() {
    Set<Integer> accts = accounts.keySet();

    for (int acc : accts) {
      int balance = accounts.get(acc);
      int newBalance = (int) (balance * (1 + rate));
      accounts.put(acc, newBalance);
    }
  }

  public String toString() {
    Set<Integer> accts = accounts.keySet();

    String result = "The bank has " + accts.size() + " accounts.\n";

    for (int acc : accts) {
      result += "\tBanc account " + acc + ": balance=" + accounts.get(acc) + "\n";
    }

    return result;
  }
}
