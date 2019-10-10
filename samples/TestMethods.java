public class TestMethods {
    public static void main(String[] args) {
        Account myAccount;
        myAccount = new Account();

        myAccount.holder = "Duke";
        myAccount.balance = 1000;

        myAccount.withdraw(200);

        myAccount.deposit(500);
        System.out.println(myAccount.balance);
    }
}
